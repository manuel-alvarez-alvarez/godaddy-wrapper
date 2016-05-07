# GoDaddy Wrapper

## Introduction

Thanks to the official [Godaddy REST API](https://developer.godaddy.com/) we can provide a small library to manage our Godaddy domains and provide useful stuff like dynamic DNS resolution.

## Installation

The library is a Spring Boot application so you can go to the [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/deployment-install.html#deployment-service) for the installation methods.

## Usage

All the utilities in the library require the usage of the Godaddy key and secret parameters:
 
```shell
java -jar godaddy-wrapper.jar
    --godaddy.key=${KEY}
    --godaddy.secret=${SECRET}
```

* **godaddy.key**: Your PRODUCTION key, create one [here](https://developer.godaddy.com/keys/)
* **godaddy.secret**: The secret of your PRODUCTION key

### Dynamic DNS

To use the Dynamic DNS service the following parameters are needed as well:

```shell
java -jar godaddy-wrapper.jar
    --dynamicdns.enable=true
    --dynamicdns.domain=${DOMAIN}
    --dynamicdns.dnsName=${DNS_NAME}    
    --dynamicdns.schedule=${CHECK_RATE}
```

* **dynamicdns.domain**: Name of the domain you want to update the DNS record (ex. mydomain.com)
* **dynamicdns.dnsName**: Name of the DNS record you want to edit (by default *@*)
* **dynamicdns.schedule**: The number of milliseconds between checks for the external IP (by default *600000*)





