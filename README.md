# Identity Category Drift Detector (ICDD) #

A Java Spring Boot service that detects when changes to identity classification schemas 
produce exclusion, and measures who bears the cost. 

The goal of the system is to automatically look at a particularly consequential part of 
a digital infrastructure, analyse its changes over a long period of time, and assess the 
risk of exclusion that this poses. 

While it's possible to understand consequences based on individual changes to an infrastructure, 
many of the most consequential changes are only felt in the gradual slow change of infrastrucutre, 
which may only develop over years or decades. 

## The Problem This System Seeks To Solve ##
The system will analyse the identity classification schema and assess how slow, gradual 
changes to an infrastructure can lead to challenges for the people represented by the 
infrastructure.

By analysing both the individual version-changes and the successive version changes, the 
system assesses the identity category drift that has taken place, and how this can be consequential 
for people.

## Theoretical Underpinning ##
The system is underpinned by theories of infrastructure, particularly the work of 
Bowker and Star. It is also influenced by intersectionality lens developed by Crenshaw, and 
Nixon's theory of slow violence.

The system is inspired by the doctoral thesis of the author Katherine Wyers, who 
conducted her doctoral research on the challenges of understand how disadvantage can 
manifest through the slow temporality of digital infrastructure. 
https://katherinewyers.com

## Proposed Features ##
### Schema Diff ###
Timeframe: Short term, scoped to individual version-changes to a classification schema
Purpose: Understand the short-term implications of the introduction of a new schema version. 

Assesses the semantic difference between two versions of a schema, categorised by change 
type (deletion, merge, split, rename, or granularity reduction). The Schema Diff determines 
not only what has changed, but also the risk of exclusion posed by this change

### Slow Drift Detector ###
Timeline: Long, over years or decades
Purpose: Understand how a series of schema changes slowly shape the lives of the people 
represented by the categories

Tracks how a set of identity categories have been shaped over a series of three or more 
schema changes. This feature makes it possible to understand the slow temporality of 
identity data infrastructure by assessing how changes take place over several concurrent 
schema changes

## Phase 1 ##
Implementing core CRUD functionality with Security features

## Phase 2: Schema Diff ##
Implement the data model for the schema, and import the first test case
Implement the mapping feature to map between schema versions
Implement the Schema Diff algorithm to assess the risk

## Phase 3: Slow Drift Detector ##
Implement the Slow Drift Detector algorithm to assess change over a series of concurrent 
schema changes



