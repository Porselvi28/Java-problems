# AGENTS — AI Coding Assistant Guidance (Quick)

Purpose
- Provide minimal, actionable instructions for AI coding agents to work productively in this repository.

Quick commands
- Compile all Java sources: `javac *.java`
- Run the main program (project contains `Main.java`): `java Main`

Files of interest
- README: [README.md](README.md) — project description and context.
- Main entry: [Main.java](Main.java)
- Example programs: [triangle.java](triangle.java), [palindrome.java](palindrome.java), [key.java](key.java)

Conventions & notes for agents
- Keep this file minimal; link to other docs rather than duplicating content.
- Java class and file names may not follow strict capitalization; inspect each file for the `public class` name before renaming files.
- There are no automated tests in the repo; run the compile and then execute the appropriate `main` class to verify behavior.

If you need more detailed agent behavior (hooks, CI integration, or language-specific skills), ask to create an expanded instruction or skill file.
# AGENTS.md — Agent instructions for this repo

Purpose: help AI coding agents quickly understand and work on this small Java repository.

Quick facts
- Language: Java
- Project files: Main.java, key.java, palindrome.java, triangle.java, [README.md](README.md#L1)

Build & run (manual)
- Compile all sources: `javac *.java`
- Run the program (check entry point): `java Main`

Notes & conventions
- There is no build tool (Maven/Gradle) or tests present; use the simple `javac` workflow above.
- Some source filenames may not follow strict Java naming conventions; do not rename files or classes without asking the repository owner.
- Prefer small, focused edits and run `javac` after changes to catch compile errors early.

Agent workflow recommendations
- Before making behavioral changes, run the program locally to confirm current behavior.
- When proposing file renames or package changes, ask the user for approval first.
- Link to this file and the README when summarizing repo setup or suggested changes.

More info
- README: [README.md](README.md#L1)
