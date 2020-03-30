<template>
  <div>
    <Example :message="message" />
  </div>
</template>

<script>
export default {
  components: {
    Example: () => import('@/components/Example.vue')
  },

  data: () => ({
    message: 'Example'
  })
}
</script>
