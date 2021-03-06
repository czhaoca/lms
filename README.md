# Lease/Rent Management System
Version 0.5/ Aug 20, 2021/ &copy; CZ

## About the Project

The author *(he/him/his)* works at a Canadian retail corporate.
A part of his routine task is to produce lease analysis to the management team.
He also produces complete lease schedule for external auditors semi-annually.


Current process is repetitive and could be streamlined.
Without existing ERP package to cater such function,
the author decides to create such a system to automate the analysis
and also to fulfill his computer science course requirement.

## Function for the Project (What will the application do?)

1. Lease record management
2. Data extraction from existing lease records
3. Data output from extraction

## User Stories (Who will use it?/ Scope of Work)
**BOLDED items included in current Phase of this project**

*(italics functions **NOT** implemented in this project)*

1.  Lease administrator
    * Manage (set) lease details, such as:
        * **Set up properties to rent with unique ID**
        * **Lease starts and expiration dates**
        * **Confirm input once new lease/property processed to the system**
        * **Reload data saved in previous session**
        * *Lease location: store number, details address, etc.*
        * *//Update lease expiration when renewals come*
        * *//Additional fields to make notes for specific lease*
    * Monitoring upcoming lease expiration
        * *Extract lease expiring in a month/quarter/year*
    
2. Finance department 
    * Monitor expired lease to prevent sending cheques to expired contract
      * **Print out *(or export)* current rent roll (active leases)**
      * *Print out total monthly payment for active leases*
