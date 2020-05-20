project_name = "Jenkins-jobdsl2"
repo = "https://github.com/s0m3r/test_jenkins.git"
repo_name = "repo1"

pipelineJob(project_name){
	definition{
		triggers{
			scm('H/1 * * * *')
		}

		cpsScm{
			scm{
				git{
					remote{
						name(repo_name)
						url(repo)
					}
				}
				scriptPath("Jenkinsfile_old")

			}
		}
	}
}