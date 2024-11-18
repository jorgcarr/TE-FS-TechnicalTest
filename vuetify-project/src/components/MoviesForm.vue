<template>
    <v-container>
        <v-form v-model="valid" ref="form">
            <v-text-field
                v-model="movie.title"
                :rules="[rules.required]"
                label="Title"
                required
            ></v-text-field>

            <v-text-field
                v-model="movie.year"
                :rules="[rules.required, rules.numeric]"
                label="Year"
                required
            ></v-text-field>

            <v-text-field
                v-model="movie.imageUrl"
                :rules="[rules.required]"
                label="Image URL"
                required
            ></v-text-field>

            <v-text-field
                v-model="movie.genre.id"
                :rules="[rules.required, rules.numeric]"
                label="Genre ID"
                required
            ></v-text-field>

            <v-text-field
                v-model="movie.author.id"
                :rules="[rules.required, rules.numeric]"
                label="Author ID"
                required
            ></v-text-field>

            <v-btn :disabled="!valid" @click="saveMovie">Save</v-btn>
        </v-form>
    </v-container>
</template>

<script>
import axios from 'axios';

export default {
    data() {
        return {
            valid: false,
            movie: {
                title: '',
                year: '',
                imageUrl: '',
                genre: {
                    id: ''
                },
                author: {
                    id: ''
                }
            },
            rules: {
                required: value => !!value || 'Required.',
                numeric: value => !isNaN(value) || 'Must be a number.'
            }
        };
    },
    methods: {
        saveMovie() {
            if (this.$refs.form.validate()) {
                axios.post('http://backend-resources:8083/movies', this.movie)
                    .then(response => {
                        console.log('Movie saved:', response.data);
                    })
                    .catch(error => {
                        console.error('Error saving movie:', error);
                    });
            }
        }
    }
};
</script>

<style scoped>
</style>