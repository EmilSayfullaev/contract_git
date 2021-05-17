package contracts

org.springframework.cloud.contract.spec.Contract.make {

    description "should delete one Vocabulary"

    request {
        method 'DELETE'
        url '/api/vocabulary/3fa85f64-5717-4562-b3fc-2c963f66afa6'
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body '''
                {
                  "result": "OK"
                }
        '''
    }
}

