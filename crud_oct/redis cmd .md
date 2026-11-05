
1. Install the Linux Distribution

wsl --install -d Ubuntu

2. Update the Linux Package Manager
   sudo apt update
3. Install Redis
   sudo apt install redis-server -y
4. Start and Verify Redis
   sudo service redis-server start
5. Verify it is working:
   redis-cli


procedure :
add two dependency 

implementation 'org.springframework.boot:spring-boot-starter-data-redis'

	implementation 'org.springframework.boot:spring-boot-starter-cache'

then follow above the cmd to make it available the redis server , then 

apply the @EnableCaching on main calss and in entity class , implements serializable and also add serialize uid ; 

in code wise means in service methods , add the code chache using annotation , then use those the methods 

how to get to know that , the dat is coming from redis or not 

either we can use monitor on cli server or add the log in method , if the data is coming from the redis that log will not call.
