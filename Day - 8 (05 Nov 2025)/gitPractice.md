# Configure your git 
` git config --global user.name "Deepak Kumar Verma" `

` git config --global user.email "boostyourselfup@gmail.com" `

# Git basic commands

<!-- create local git repository -->
git init 


<!-- git add command is always used to bring the file from non-staging area to staging area -->
<!-- at this stage the git is only aware about the file not actually tracking it's content -->
git add 

<!-- not git tracks the files -->
git commit -m "messaage for commit"

<!-- commit object -->
commit object stores 
 - who has made the commit
 - when the commit is made
 - message for the commit 
 - snapshot of stagged files  --> using encryption techenic SHA1 (Secure Hashing Algorithm 1) generate 40 AlphaNumeric Characters

<!-- check all the commits -->
git log

<!-- the default branch created using git init is  -->
master

<!-- if we want to change the default branch name at the time of initialization of git -->
git init --initial-branch=main

<!-- git doesn't tracks empty folders -->

<!-- there are two attributes associated with git status -->
-v -> it means verbose, it is used to show detailed status of files
-s -> it means short, it is used to show status of files in short

git status -v
git status -s


<!-- to undo the git add command for files from stagging area to non-stagging area -->
git rm --cached filenames


<!-- branch is only created when we do the first commit -->


<!-- to modify the last commit message -->
<!-- it gives chance to edit the last commit message also -->
git commit --amend

<!-- if we don't want to edit the last commit message -->
git commit --amend --no-edit

<!-- to create empty commit -->
git commit --allow-empty -m "Commit message"

<!-- signed the git commit -->
git commit -s -m "task done"


<!-- to see only last n commits -->
git log -n commit-numbers

<!-- to see in better formats for git log -->
git log --pretty=oneline
git log --pretty=short
git log --pretty=full
git log --pretty=fuller

git log --pretty="%h"   --> only hashcode
git log --pretty="%h %s"  --> hashcode with commit messages
git log --pretty="%h %s %an"  --> hashcode commit_message author_name
git log --pretty="%h %s %an %ae"   --> hashcode commit_message  author_name author_email

<!-- to see the changes done  -->
git log -p


<!-- to see the last one week commits -->
git log --since="yesterday"
git log --since="1 week ago"
git log --since="2025-11-10" --until="2025-08-01"
git log --author="Deepak Kumar Verma"

<!-- this is the default mode of reset command (Not Recommanded) -->
<!-- purpose of using reset is just undo the files changes -->

<!-- it puts the files into non-staging area -->
git reset --mixed commit_hash   --> don't delete the changes just make the files unstagged

<!-- it puts the files into the staging area -->
git reset --soft commit_hash   --> don't delete the changes just brought the files into stagging area

git reset --hard commit_hash   --> delete the changes 

<!-- Using Revert -->
<!-- purpose of using rever is undo the file changes -->
<!-- Recommanded way to undoing changes -->
<!-- it revert the changes along with preserving the history and make new commit over that -->
git revert hash_of_commit_which_changes_should_reverted

<!-- by default head is pointing to the latest commit -->
<!-- to change the pointer of head -->
git checkout

<!-- to check the current local branch name -->
git branch

<!-- to create a branch -->
git branch Deepak

<!-- to delete a branch -->
git branch -d Deepak

<!-- travel from one branch to another branch -->
git checkout branch_name
git switch branch_name    --> new feature added

<!-- to bring features from another branch without merging -->
git cherry-pick commit_hash

<!-- to established a connection b/w local and remote repo -->
git remote add origin master

<!-- to brought the remote repo and setup locally along with the connections -->
git clone repo_url

<!-- to push our new changes into the remote repo -->
git push -u origin branch_name

<!-- git fetch is always going to update the remote tracking branches but not added to local branch so we need to do explicite merge to get locally -->
git fetch           --> fetch all the branches changes
git fetch origin    --> fetch all the branches changes
git fetch origin master --> fetch only the named branch changes
git fetch --all     --> if one local repo is connect with multiple remote repos it will fetch all the changes from all remote origins

git checkout origin/master

git merge origin/master


<!-- it is a combination of git fetch and git merge commands -->
git pull    --> not recommanded in org because of merge conflicts can happen

<!-- git stash is used to keep any kind of modification made into the already tracked file for temperory without making actual commit -->
git stash

git stash list

git stash apply stash_id