<template>
<div>
  <p >这是登录页面</p>
  <button @click="fun1">点我登录</button>
</div>
</template>

<script>
export default {
  name: "Login",
  methods:{
    fun1:function () {
      this.$router.push({path:'/main'})
    }
  }
}
</script>

<style scoped>

</style>
