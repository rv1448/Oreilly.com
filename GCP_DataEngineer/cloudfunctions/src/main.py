from flask import current_app, escape
def hello(request):
    return "hello world"


def hello2(request):
    return "Hello World!!!!!"

def sample_http(request):
    subject = request.args.get('subject','world')
    print(request.get_json())
    print(dir(request))
    return f'Hello, {subject}!'

print(sample_http("asasd"))
