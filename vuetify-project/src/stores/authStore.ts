import { defineStore } from 'pinia';

const useAuthStore = defineStore('storeAuth', {
    state: () => ({
        user: null as null | { id: string; name: string },
        token: null as null | string,
        test: false
    }),
    actions: {
        testAction() {
            this.test = !this.test;
        },
        setUser(user: { id: string; name: string }) {
            this.user = user;
        },
        setToken(token: string) {
            this.token = token;
        },
        clearAuth() {
            this.user = null;
            this.token = null;
        },
    },
    getters: {
        isAuthenticated: (state) => !!state.token,
    },
});

export default useAuthStore;