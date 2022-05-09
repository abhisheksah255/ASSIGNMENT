import React from 'react'
import { useNavigate,useParams } from 'react-router-dom'

const SERVICES = () => {

  let {page}=useParams();
  return (
    <div>
       <h1 className='text-center'>This is <span>Service</span></h1>
    </div>
  )
}

export default SERVICES
