package contracts

org.springframework.cloud.contract.spec.Contract.make {

    description "should get one Vocabulary"

    request {
        method 'GET'
        url '/api/vocabulary/3fa85f64-5717-4562-b3fc-2c963f66afa6'
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body '''
                          {
                              "vocabulary_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                              "vocabulary_name": "vocabulary_name",
                              "vocabulary_content": [
                                                        {
                                                          "item_id": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                                                          "name": "name",
                                                          "value": "value"
                                                        }
                                                    ],
                              "system_name": "system_name",
                              "system": true
                          }
        '''
    }
}

