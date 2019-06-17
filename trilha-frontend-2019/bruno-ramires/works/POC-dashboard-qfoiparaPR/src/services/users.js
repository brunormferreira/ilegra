import AxiosInstance from './axios.config'

const getUsers = () => {
  return AxiosInstance.get(`/users?per_page=7`)
    .then(response => response)
}

export default {
  getUsers
}