import { useParams } from 'react-router-dom'

export default function Dinamica() {
const {id} = useParams()

  return (
    <div>
      Dinamica {id}
    </div>
  )
}
