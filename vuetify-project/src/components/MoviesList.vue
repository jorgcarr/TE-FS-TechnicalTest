<template>
  <v-container class="fill-height">
    <v-responsive
      class="align-centerfill-height mx-auto"
      max-width="900"
    >
    <!-- Test Pinia persisted state button stores uin AuthStore -->

    <h1>Movies</h1>
    <v-data-table :items="items"></v-data-table>

    </v-responsive>
  </v-container>
</template>

<script setup lang="ts">
import {onMounted} from "vue"
import { ref } from "vue";
import axios from "axios";

 const items = ref([])
 onMounted(async () => {
   const response = await axios.get("http://backend-resources:8083/movies")
   items.value = response.data["_embedded"].movies
  })
  
</script>
