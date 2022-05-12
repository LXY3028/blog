<template>
  <div class="card">
    <!--展示名片头部--头像名称-->
    <div class="card-header">
      <el-avatar :size="50" :src="user.avatar"></el-avatar>
      <p style="margin-top: 0px;">zZ</p>
      <el-divider></el-divider>
    </div>
    <!--卡片中部--github地址-->
    <div class="card-middle">
      <div style="max-width: 40px;margin-left: 10px;padding: 2px">
       <!-- <el-image :fit="fit"
                  src="https://cdn.jsdelivr.net/gh/yubifeng/blog-resource/bloghosting//website/static/githubLogo.webp"
                  style="cursor:pointer" @click="goToGithub"></el-image>-->
        <div style="margin:2px ;height: 20px" >
          <iframe scrolling="no" frameborder="0" allowtransparency="true" src="http://i.tianqi.com/index.php?c=code&id=34&icon=1&num=3"></iframe>
        </div>
      </div>
    </div>
    <!--卡片底部--个人喜好-->
    <div class="card-footer">
      <el-collapse>
        <el-collapse-item name="1" style="padding-left: 20px;padding-right: 20px" title="最喜欢的动漫">
          <div>天空之城、你的名字</div>
        </el-collapse-item>
        <el-collapse-item name="2" style="padding-left: 20px;padding-right: 20px" title="最喜欢的女孩子">
          <div>小不点</div>
        </el-collapse-item>
        <el-collapse-item name="3" style="padding-left: 20px;padding-right: 20px" title="最喜欢的游戏">
          <div>暂无</div>
        </el-collapse-item>
      </el-collapse>
    </div>
  </div>
</template>

<script>
export default {
  name: "Card",
  data() {
    return {
      hasLogin: false,
      fit: 'fill',
      user: {
        avatar: "https://cdn.jsdelivr.net/gh/LXY3028/photo/img/IMG_20190806_002757.jpg"
      },
    }
  },
  methods: {
    //跳转到个人github
    goToGithub() {
      window.location.href = "https://github.com/"
    }
  },
  created() {
  }
}
</script>

<style scoped>
.card {
  width: 250px;
  padding: 20px 0px 0px 0px;
  background-color: white;
}
.card-header {
  text-align: center;
}
.card-footer {
  margin-top: 10px;
}
.card:hover {
  -webkit-box-shadow: #ccc 0px 10px 10px;
  -moz-box-shadow: #ccc 0px 10px 10px;
  box-shadow: #ccc 0px 10px 10px;
}
</style>