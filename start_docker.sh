docker run -p 8080:8080 -p 50000:50000 -v /var/jenkins_home --name="jenkins" jenkins/jenkins:lts-jdk11 -d
docker run -v jiraVolume:/var/atlassian/application-data/jira --name="jira" -d -p 8081:8080 atlassian/jira-software