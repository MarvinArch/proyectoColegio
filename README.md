## Features

- API made for the management of information from educational institutions
- Project made whit SpringBoot



**Table of Contents**

[TOCM]

[TOC]

# H1 API end points
## Degree
### get degree

> https://localhost:8080/grado

	 curl -X 'GET' \
	http://localhost:8080/grado \

### post degree
> https://localhost:8080/grado

#### Request body

	{
		"id": 0
		"nombre grado": "string"
		"idProfesorEncargado": 0
	}
