import useAuthStore  from "@/stores/authStore";

export default {
    install: (app: any) => {
        app.config.globalProperties.$auth = useAuthStore();
    },
};