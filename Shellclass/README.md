## Built in
	- type is check whether a command is built-in
	- type -a CMD : gives all the commands that will be used


## Vagrant

BOX = Operating system Image
vagrant box add will download and store the box in local system

```bash
vagrant box add USER/box
vagrant init jason/centos7 #will create the Vagrantfile
vagrant up #will run the vagrant VM box
vagrant halt #will shutdown the VM softly



##Vagrant configuration file


Vagrant.configure(2) do |config|
  config.vm.box = "jason/centos7"
  config.vm.hostname = "nameofthelinux"
  config.vm.network "private_network",  ip: "10.2.0.7"
  config.vm.provision "shell", path: "setup.sh"
  config.vm.provider "virtual box" do |vb|
    vb.gui = true
    vb.memory = 1024
  end
end
  
```


