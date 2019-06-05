# testng-maven
Test-run instructions:

Clone the project with command:
git clone https://github.com/waitmyhomie/testng-maven.git

Setup your test environment(install MAVEN, JAVA, download drivers and set them to the system variables)

Run tests with command: mvn clean test

After run you can see result in  allure with command: mvn allure:serve

You can also run Tests in firefox/chrome with command: mvn clean test -Dselenide.browser=firefox, mvn clean test -Dselenide.browser=chrome# testng-maven
