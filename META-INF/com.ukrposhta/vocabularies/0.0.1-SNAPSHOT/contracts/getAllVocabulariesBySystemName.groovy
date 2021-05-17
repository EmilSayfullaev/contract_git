package contracts

org.springframework.cloud.contract.spec.Contract.make {

    description "should get all Vocabularies by SystemName"

    request {
        method 'GET'
        url '/api/vocabularies/systemName?limit=10&offset=0'
    }

    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body '''
                {
                       "data":[
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
                               ],
                              "total": 1
                }
        '''
    }
}

