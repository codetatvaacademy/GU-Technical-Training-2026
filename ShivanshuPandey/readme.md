# GU-Technical-Training-2026

Welcome to the **GU-Technical-Training-2026** repository! This guide will walk you through setting up the project on your local machine, making changes, and contributing to the repository. It is designed with beginners in mind, providing detailed instructions for every step.

---

## Table of Contents
- [Prerequisites](#prerequisites)
- [Cloning the Repository](#cloning-the-repository)
- [Setting Up the Project](#setting-up-the-project)
- [Making Changes](#making-changes)
- [Pushing Changes](#pushing-changes)
- [When to Push Changes](#when-to-push-changes)
- [Creating a Pull Request](#creating-a-pull-request)
- [Additional Tips](#additional-tips)

---

## Prerequisites
Before getting started, ensure you have the following installed:

1. **Git**: [Download and install Git](https://git-scm.com/downloads).
2. **Text Editor/IDE**: Use any text editor like VS Code, IntelliJ, or Sublime Text.
3. **GitHub Account**: Sign up at [GitHub](https://github.com/) if you don't already have an account.
4. **Basic Terminal Knowledge**: Familiarity with basic terminal commands will be helpful.

---

## Cloning the Repository
To start working on the repository:

1. Open your terminal (or command prompt).
2. Navigate to the directory where you want to clone the repository.
   ```bash
   cd /path/to/your/folder
   ```
3. Clone the repository using the following command:
   ```bash
   git clone https://github.com/your-username/GU-Technical-Training-2026.git
   ```
4. Navigate into the cloned repository:
   ```bash
   cd GU-Technical-Training-2026
   ```

---

## Setting Up the Project

1. Check the contents of the repository:
   ```bash
   ls  # On Linux/Mac
   dir # On Windows
   ```
2. Open the project in your preferred text editor/IDE.


---

## Making Changes

### Step 1: Create a New Branch
It is important to make changes in a separate branch to avoid conflicts:
```bash
git checkout -b feature/your-feature-name
```

### Step 2: Make Edits
Edit the files you want in your text editor or IDE. Save your changes when done.

### Step 3: Check the Changes
Use the following command to see the modified files:
```bash
git status
```

### Step 4: Add Changes to Staging
Stage the files you want to commit:
```bash
git add filename.ext
# Or stage all changes

git add .
```

### Step 5: Commit Your Changes
Write a meaningful commit message describing what you have done:
```bash
git commit -m "Added feature X to do Y"
```

---

## Pushing Changes

### Step 1: Push Your Branch to Remote
Push the branch to the remote repository:
```bash
git push origin feature/your-feature-name
```

### Step 2: Create a Pull Request
1. Go to the repository on GitHub.
2. Click the "Pull Requests" tab.
3. Click the "New Pull Request" button.
4. Select your branch and describe your changes.
5. Submit the pull request.

---

## When to Push Changes

Push your changes when:
- You have completed a small, self-contained task.
- You want to back up your work.
- You need to share your progress with teammates.

Avoid pushing half-done work unless it is necessary to collaborate.

---

## Creating a Pull Request

1. Ensure your branch is up-to-date with the main branch:
   ```bash
   git checkout main
   git pull origin main
   git checkout feature/your-feature-name
   git merge main
   ```
2. Resolve any merge conflicts if they arise.
3. Push the updated branch and create the pull request as described earlier.

---

## Additional Tips
- **Sync Regularly**: Pull the latest changes from the main branch before starting new work:
  ```bash
  git pull origin main
  ```
- **Use Clear Commit Messages**: Write concise and descriptive commit messages.
- **Avoid Committing Large Files**: Ensure you do not commit unnecessary large files or sensitive information.

If you face any issues, feel free to reach out to the repository maintainers for help.

---

Thank you for contributing to **GU-Technical-Training-2026**! Together, we can build something amazing.
