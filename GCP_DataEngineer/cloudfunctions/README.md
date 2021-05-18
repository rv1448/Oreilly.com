## Cloud Functions
- Cloud functions are 2 types
    + HTTP functions 
        * All http functions supported (GET, PUT, POST, DELETE, etc)
        * Variety of content formats are supported(JSON, Octet Stream, Text, URL encoded)
        * Function invoked just once
        ```python 
        def hello_http(request):
            request_json = request.to_json()
            if 'name' in request_json:
                name = request_json['name']
            else:
                name = ''
            return 'Greeting from the HTTP request {}'.format(name)
        ```
    + Background functions
        * Background functions are responses to cloud based events 
        * pub-sub topic change, Cloud Storage bucket change
        * Function invoked at least once 
        ```python
        def hello_gcs(data, context):
            print('File: {}'.format(data['Objectid']))
        ```

## TRIGGERS 

- Triggers declare your function interest in a specific event
- Triggers are bound to functions during deployment 
- Triggers are bound to functions on many-to-one basis 
    + Same trigger can bound to multiple functions 
    + Each function has only one trigger
```
        http                          Cloud Pub/sub
        --trigger-http              --trigger-topic
            \                     /
             \                   /   
              \ Cloud Functions / 
           /                     \
         /                        \
        /                          \  
    --trigger-bucket                --trigger-topic
Cloud Storage                       Stackdriver 
```

## TYPES OF FUNCTIONS
- Http functions 
- Background functions
    + Use background functions to when you want to have your cloud function invoked directly in response to an event
    ``` python
    ##SAMPLE SCRIPT 
    def hello_gcs(event, context):
    """Background Cloud Function to be triggered by Cloud Storage.
       This generic function logs relevant data when a file is changed.

    Args:
        event (dict):  The dictionary with data specific to this type of event.
                       The `data` field contains a description of the event in
                       the Cloud Storage `object` format described here:
                       https://cloud.google.com/storage/docs/json_api/v1/objects#resource
        context (google.cloud.functions.Context): Metadata of triggering event.
    Returns:
        None; the output is written to Stackdriver Logging
    """

    print('Event ID: {}'.format(context.event_id))
    print('Event type: {}'.format(context.event_type))
    print('Bucket: {}'.format(event['bucket']))
    print('File: {}'.format(event['name']))
    print('Metageneration: {}'.format(event['metageneration']))
    print('Created: {}'.format(event['timeCreated']))
    print('Updated: {}'.format(event['updated']))


    event : event name is {
    'bucket': 'extract-name-object', 'contentType': 'text/plain', 
    'crc32c': 'R+xpiQ==', 'etag': 'CPmnhuD96e0CEAE=', 'generation': '1608928504943609',
    'id': 'extract-name-object/b.txt/1608928504943609', 'kind': 'storage#object', 
    'md5Hash': 'jyQGe7sZSpOoDuHWY9h4Bw==',
    'mediaLink': 'https://www.googleapis.com/download/storage/v1/b/extract-name-object/o/ b.txt?generation=1608928504943609&alt=media',
    'metageneration': '1', 'name': 'b.txt',
    'selfLink': 'https://www.googleapis.com/storage/v1/b/extract-name-object/o/b.txt',
    'size': '38', 'storageClass': 'STANDARD', 'timeCreated': '2020-12-25T20:35:04.943Z', 
    'timeStorageClassUpdated': '2020-12-25T20:35:04.943Z', 'updated': '2020-12-25T20:35:04.943Z'
  }


    context : context name is {
        event_id: 1705538013572970, timestamp: 2020-12-25T20:35:05.118Z,
        event_type: google.storage.object.finalize, 
        resource: {
            'service': 'storage.googleapis.com', 'name': 'projects/_/buckets/extract-name-object/objects/b.txt', 'type': 'storage#object'
            }
        }

 
    ```


