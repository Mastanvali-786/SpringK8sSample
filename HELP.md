# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.5/maven-plugin/build-image.html)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

# Docker Image Building and Pushing

* [docker build -t springk8ssample:1.0 .]()
* [docker tag springk8ssample:1.0 mastanvali2600/springk8ssample:latest]()
* [docker push mastanvali2600/springk8ssample:latest]()

# Deploying and checking application in minikube

* [minikube start --driver=docker]()
* [kubectl apply -f deployment.yaml]()
* [kubectl apply -f service.yaml]()
* [minikube service spring-k8s-sample --url]()
* [kubectl delete -f service.yaml]()
* [kubectl delete -f deployment.yaml]()
* [minikube stop]()


