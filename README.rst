=======
Template for Scala on Kubernetes/Docker
=======

Hello World example for automated Scala to Docker build (to run directly without any orchestration) or with push to DockerHub and to Kubernetes.

.. image:: https://img.shields.io/badge/scala_template_for_k8s-v1.0.0-green.svg
        :target: https://github.com/janrock-ylb?tab=repositories
        :alt: Release Status

Features
--------

| Basic build to demonstrate the process from code to k8s logs.

Usage
-----
- Install Docker and Kubernetes
- Edit the example Scala code
- (option a) sbt clean, assembly -> fat jar build
- (option b) sbt clean, docker -> docker run build
- (option c) sbt clean, dockerBuildAndPush -> docker build and push to DockerHub for k8s pull
- Run set of bash scripts
startpod:
kubectl create -f scala-k8s_pod.yaml

validate:
kubectl get pods

show-logs:
kubectl logs scala-k8s
(static console output without refresh)

stop-pod:
kubectl delete pod scala-k8s
(delete pod)
docker rmi yottalabs/scala-k8s
(remove local Docker image)

Version Support
---------------
v1.0: Initial Commit

Requirements
------------
- JDK8, Scala, Docker, Kubernetes
- IntelliJ is ideal (code, sbt console and terminal as one window)

More examples will be available soon...
