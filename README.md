# api-java
# Para ejecutar el proyecto en minikube ejecutar los siguientes comandos en la raiz del repositorio
  kubectl apply -f deployment.yaml
  kubectl apply -f service.yaml 
# para validar la ip que expone minikube ejecutar el siguiente comando
 minitube ip
# Acceder desde el navegador 
 http://ipminikube:30000/hello
# para ejecutar el chart 
 helm install   api-0.01 . --values values.yaml 
proyecto java
