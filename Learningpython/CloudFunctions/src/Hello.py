
def hello_http(request):
    print(request)
    print(dir(request))

    request_json = request.get_json(silent=True)
    print(request_json)
    print(dir(request_json))
data = {'name':'hellow'}
print(hello_http(data))




