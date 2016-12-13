# knime-plants

KNIME nodes to configure, run and analyze PLANTS protein-ligand docking

PLANTS homepage at http://www.mnf.uni-tuebingen.de/fachbereiche/pharmazie-und-biochemie/pharmazie/pharmazeutische-chemie/pd-dr-t-exner/research/plants.html

[![Build Status](https://travis-ci.org/3D-e-Chem/knime-plants.svg?branch=master)](https://travis-ci.org/3D-e-Chem/knime-plants)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/74d1f7600e4c43cbab963d7f30963cee)](https://www.codacy.com/app/3D-e-Chem/knime-plants?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=3D-e-Chem/knime-plants&amp;utm_campaign=Badge_Grade)
[![Codacy Badge](https://api.codacy.com/project/badge/Coverage/74d1f7600e4c43cbab963d7f30963cee)](https://www.codacy.com/app/3D-e-Chem/knime-plants?utm_source=github.com&utm_medium=referral&utm_content=3D-e-Chem/knime-plants&utm_campaign=Badge_Coverage)

This project uses [Eclipse Tycho](https://www.eclipse.org/tycho/) to perform build steps.

# Installation

Requirements:

* KNIME, https://www.knime.org, version 3.1 or higher

Steps to get the Configure KNIME node inside KNIME:

1. Goto Help > Install new software ... menu
2. Press add button
3. Fill text fields with https://3d-e-chem.github.io/updates which contains this node.
4. Select --all sites-- in `work with` pulldown
5. Select the node
6. Install software
7. Restart Knime

# Usage

1. Create a new Knime workflow.
2. Find node in Node navigator panel.
3. Drag node to workflow canvas.

# Build

```
mvn verify
```

An Eclipse update site will be made in `p2/target/repository` repository.
The update site can be used to perform a local installation.

# Development

Steps to get development environment setup:

1. Download KNIME SDK from https://www.knime.org/downloads/overview
2. Install/Extract/start KNIME SDK
3. Start SDK
4. Install m2e (Maven integration for Eclipse) + KNIME Testing framework

    1. Goto Help > Install new software ...
    2. Make sure Update site is http://update.knime.org/analytics-platform/3.1 is in the pull down list otherwise add it
    3. Select --all sites-- in work with pulldown
    4. Select m2e (Maven integration for Eclipse)
    5. Select `KNIME Testing framework`
    6. Install software & restart

5. Import this repo as an Existing Maven project

During import the Tycho Eclipse providers must be installed.

## Tests

Tests for the node are in `tests/src` directory.
Tests can be executed with `mvn verify`, they will be run in a separate KNIME environment.
Test results will be written to `test/target/surefire-reports` directory.

### Unit tests

Unit tests written in Junit4 format can be put in `tests/src/java`.

### Workflow tests

See https://github.com/3D-e-Chem/knime-testflow#3-add-test-workflow

# New release

1. Update versions in pom files with `mvn org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=<version>` command.
2. Manually update version of "source" feature in `p2/category.xml` file.
3. Commit and push changes
3. Create package with `mvn package`, will create update site in `p2/target/repository`
4. Append new release to an update site
  1. Make clone of an update site repo
  2. Append release to the update site with `mvn install -Dtarget.update.site=<path to update site>`
5. Commit and push changes in this repo and update site repo.

## Offline Knime update site

If Knime update site can not be contacted then use a local version.

1. Download zip of update site from https://www.knime.org/downloads/update
2. Unzip it
3. To maven commands add `-Dknime.update.site=file://<path to update site directory>`
