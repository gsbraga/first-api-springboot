# Primeira Entrega

## Primeira API usando SpringBoot
**Salvando os dados dos Produtos em Lista e retornando a listagem dos dados**


##Método GET:
###URL: `http://localhost:8080/api/v1/products/{category}`

	`category: int`

###Retorno:
	[
	    {
	        "id": 1,
	        "name": "Produto",
	        "description": "Descrição do produto"
	    }
	]


##Método POST:
###URL: `http://localhost:8080/api/v1/products`

###DADOS
	{
	    "name": "Produto",
	    "category": 1,
	    "description": "Descrição do produto"
	}

###Retorno:
    {
        "id": 1,
        "category": 1,
        "name": "Produto",
        "description": "Descrição do produto"
    }