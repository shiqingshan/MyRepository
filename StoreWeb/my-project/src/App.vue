<template>
  <div id="app">
    <img src="./assets/logo.png">
    <HelloWorld/>
    <p v-html="hello">{{hello}}</p>
    <ul>
      <li v-for="item in list">{{item.name}}</li>
    </ul>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld'

export default {
  name: 'app',
  components: {
    HelloWorld
  },
  data (){
    return{
      hello:'<span><img>wold</span>',
      list:[{
        name:'apple',
        peice:34
      },{
        name:'bbbb',
        peice:35
      }]
    } 
}
};

</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
