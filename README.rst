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
1) Install Docker and Kubernetes
2) Edit the example Scala code
3a) sbt clean, assembly -> fat jar build
3b) sbt clean, docker -> docker run build
3c) sbt clean, dockerBuildAndPush -> docker build and push to DockerHub for k8s pull

4) Run set of bash scripts
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
1) JDK8, Scala, Docker, Kubernetes
2) IntelliJ is ideal (code, sbt console and terminal as one window)

More examples will be available soon...
