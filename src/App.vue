<template>
  <div id="app">
<router-view/>
  </div>
</template>

<script>

export default {
  name: 'App',
  methods:{
    inf:function () {
      this.$router.push({path:'/login'})
    }
  },
  created() {
    this.inf();
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
