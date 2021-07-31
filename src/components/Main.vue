<template>
<div>
  <p>这是主页面页面{{p_ifhas}}{{p_username2}}</p>
  <br>
  插入一条数据到mysql：<input v-model="p_username"><br>{{p_username}}<br>
  <button @click="addOne">确定插入</button>
  <hr>
  <button @click="quef">点此按钮查询所有数据</button>
  <p>{{p_all}}</p>

</div>
</template>

<script>
import axios from "axios";
export default {
  name: "Main",
  data(){
    return{
      p_username:'',
      p_username2:'',
      p_ifhas:'',
      p_all:''
    }
  },
  methods:{
    addOne:function () {
      axios.post(
'http://192.168.192.129:7001/Eleven_SSM_JavaServer-1.0-SNAPSHOT/eleven/add.do',
          {'p_username':this.p_username}
      ).then(
      response =>{
        alert(response.data.yesno)
        if (response.data.yesno){
          this.p_ifhas=',欢迎'
           this.p_username2=this.p_username
        }
      }
      )
    },

    quef:function () {
      axios.post(
        'http://192.168.192.129:7001/Eleven_SSM_JavaServer-1.0-SNAPSHOT/eleven/que.do',
          {'test':'test'}
      ).then(
        respose => {
          this.p_all = respose.data.allPOJO
        }
      )
    }
  },
  created() {
  }
}
</script>

<style scoped>

</style>
