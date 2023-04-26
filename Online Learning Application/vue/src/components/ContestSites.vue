<template>
    <div class="sites">
        <h2>E-LEARNING PLATFORM</h2>
        <ul>
            <li v-for="(site, index) in $store.state.sites" 
                v-bind:key="site.siteId"><a href="#" 
                                            v-on:click.prevent="addSite(index)">{{ site.siteName }}</a></li>
        </ul>
    </div>
</template>

<script>
//import contestServce from '../services/ContestService.js';
import siteService from '../services/SiteService.js';

export default {
    name: 'contest-sites',
    methods: {
        addSite(pos) {
            this.$store.commit("ADD_TO_CURRENT_SITES", pos);
        }
    },
    created() {
        siteService.getSites().then(response => {
                this.$store.commit("LOAD_SITES", response.data);
            });
        }
    }
</script>

<style>
.sites {
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
}
</style>