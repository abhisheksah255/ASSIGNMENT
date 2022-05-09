import React, { useState, useEffect } from 'react'
import axios from 'axios'

function CurrentWeatherDisplay() {
	const [information, setInformation] = useState({})
	const [name, setName] = useState(1)
	const [nameFromButtonClick, setNameFromButtonClick] = useState(1)

	useEffect(() => {
		axios
			.get(`https://api.openweathermap.org/data/2.5/weather?q=${name}&appid=9d5ef1f77eac65bf8303761ee26e4e07`)
			.then(res => {
        console.log(res)
        setInformation(res.data)
			})
			.catch(err => {
				console.log(err)
			})
	}, [nameFromButtonClick])

	const handleClick = () => {
		setNameFromButtonClick(name)
	}

	return (
		<div>
			<input type="text" value={name} onChange={e => setName(e.target.value)} />
			<button type="button" onClick={handleClick}>Fetch Data</button>
			<div>{information.weather}</div>
			{/* <ul>
				{posts.map(post => (
          <li key={post.id}>{post.title}</li>
				))}
			</ul> */}
		</div>
	)
}

export default CurrentWeatherDisplay