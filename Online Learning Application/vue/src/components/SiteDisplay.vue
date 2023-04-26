<template>
  <div class="site-display">
      <h2>{{ site.siteName }}</h2>
      {{ site.url }}
  </div>
</template>

<script>
export default {
    name: "site-display",
    props: ["site"]
}
</script>

<style>
div.site-display {
    border: 1px solid black;
    width: 200px;
}

</style>