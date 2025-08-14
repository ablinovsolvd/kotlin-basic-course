# How to Work with Branches and Pull Requests in IntelliJ IDEA and GitHub

This guide will help you step by step to:
- Create a new branch in IntelliJ IDEA
- Make changes and commit them
- Send (push) your branch to GitHub
- Create a Pull Request (PR) on GitHub
- Merge your PR after approval
- Update your local `main` branch in IntelliJ IDEA

---

## 1. Create a New Branch in IntelliJ IDEA

**A branch lets you work on your own changes without affecting the main code.**

**Example branch names:**  
`feature/my-tasks`  
`fix/bug-123`  
`task/arrays-homework`

**Steps:**

1. **Open your project in IntelliJ IDEA.**
2. **Find the branch widget in the bottom-right corner** (it often says `main` or the name of your current branch).
3. **Click on the branch name** — a menu will appear.
4. **Select “New Branch”.**
5. **Type a name for your branch** (for example, `feature/arrays-practice`) and click “Create”.

Now you are working in your new branch!

---

## 2. Make Changes and Commit Them

**Committing means saving your changes to the branch.**

**Steps:**

1. **Edit your files** — write code, solve tasks, etc.
2. **After you finish a small piece of work:**
    - Press `Ctrl+K` (Windows/Linux) or `Cmd+K` (Mac), or
    - Go to **VCS > Commit...** in the top menu.
3. **A commit window will open.**
4. **Select the files you want to commit** (usually all your changes).
5. **Write a short, clear commit message** (for example, `Add solutions for array tasks`).
6. **Click “Commit”** (or “Commit and Push” if you want to send changes right now).

---

## 3. Push Your Branch to GitHub

**Pushing means sending your commits from your computer to GitHub.**

**If you didn’t click “Commit and Push” before:**

1. **Go to the top menu:**
    - Select **VCS > Git > Push**
    - Or press `Ctrl+Shift+K` (Windows/Linux) or `Cmd+Shift+K` (Mac)
2. **IDEA will show your branch and commits.**
3. **Click “Push”**.

Your new branch and commits are now on GitHub!

---

## 4. Create a Pull Request (PR) on GitHub

**A Pull Request lets others review your changes and merge them into the main branch.**

**Steps:**

1. **Go to your project on GitHub** in your browser.
2. **GitHub will often show a “Compare & pull request” button** after pushing a new branch.
    - If not, go to the “Pull requests” tab and click “New pull request”.
3. **Select your branch** (for example, `feature/arrays-practice`) as the “compare” branch.
4. **Make sure “main” is the “base” branch.**
5. **Write a title and description for your PR** (for example, `My solutions for array tasks`).
6. **Click “Create pull request”.**

Now your PR is open. Others can review and approve it.

---

## 5. Merge Your Pull Request After Approval

**Once your PR is approved (or you are allowed to merge):**

1. **Open the PR page on GitHub.**
2. **Click the “Merge pull request” button.**
3. **Confirm by clicking “Confirm merge”.**

Your branch’s changes are now part of `main` on GitHub!

---

## 6. Switch to Main and Update in IntelliJ IDEA

**After merging, update your local `main` branch so you have the latest code.**

**Steps:**

1. **In IntelliJ IDEA, click the branch widget again (bottom-right corner).**
2. **Select `main` to switch to the main branch.**
3. **Go to the top menu:**
    - Select **VCS > Git > Pull**
    - Or press `Ctrl+T` (Windows/Linux) or `Cmd+T` (Mac)
4. **IDEA will download the latest changes from GitHub.**

Now your local `main` branch is up to date!

---

## Example Summary (with example branch name):

1. Create a new branch: `feature/my-arrays-tasks`
2. Make changes and commit: `Add array solutions`
3. Push branch to GitHub.
4. Create a PR from `feature/my-arrays-tasks` into `main`.
5. After approval, merge PR.
6. Switch to `main` in IDEA and pull to update.

---

**Tips:**
- Always give your branch and commit clear, short names.
- Commit often — small commits are easier to review.
- Pull the latest changes before starting new work to avoid conflicts.

---