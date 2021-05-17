package contracts

org.springframework.cloud.contract.spec.Contract.make {

    description "should update Vocabularies"

    request {
        method 'PUT'
        url '/api/vocabulary/3fa85f64-5717-4562-b3fc-2c963f66afa6'
        headers {
            contentType applicationJson()
        }
        body '''
                          [
                              {
                                "vocabulary_name": "vocabulary_name",
                                "system_name": "system_name",
                                "system": true,
                                "vocabulary_content": [
                                  {
                                    "item_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                                    "name": "name",
                                    "value": "value"
                                  }
                                ]
                              }
                          ]
        '''
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

