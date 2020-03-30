<template>
  <div class="user">Hello, {{ user.name }}!</div>
</template>

<script>
export default {
  data: () => ({
    user: null
  }),

  async created() {
    const { data } = await this.axios.get('/api/user/' + this.$route.params.id)

    // console.log(data)
    this.user = data
  }
}
</script>

<style scoped>
.user {
  font-size: 2.25rem;
}
</style>
