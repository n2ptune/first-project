<template>
  <div class="root">
    <router-view />
  </div>
</template>

<script>
export default {
  data: () => ({
    message: 'Example'
  })
}
</script>

<style scoped>
.root {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100vh;
}
</style>
