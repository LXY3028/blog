package com.hx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hx.common.lang.vo.PageComment;
import com.hx.entity.Comment;
import com.hx.mapper.CommentMapper;
import com.hx.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 服务实现类
 *
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {
    @Autowired
    CommentMapper commentMapper;


    /**
     * 通过博客id和父评论id查找所有子评论 并按照时间倒序排序
     *
     * @param blogId
     * @param parentCommentId
     * @return
     */
    @Override
    public List<PageComment> getPageCommentListByDesc(Long blogId, Long parentCommentId) {
        return commentMapper.getPageCommentListByPageAndParentCommentIdByDesc(blogId, parentCommentId);
    }

    /**
     * 通过博客id和父评论id查找所有子评论
     *
     * @param blogId
     * @param parentCommentId
     * @return
     */
    @Override
    public List<PageComment> getPageCommentList(Long blogId, Long parentCommentId) {
        return commentMapper.getPageCommentListByPageAndParentCommentId(blogId, parentCommentId);
    }


}
