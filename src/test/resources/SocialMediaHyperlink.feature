#Author : Himalayg
@SocialMediaHyperlink

Feature: SocialMediaHyperlink


Scenario: Instagram hyperlink check
Given User is on contacts tab
When user clicks instagram hyperlink
Then corresponding instagram link should open

Scenario: Facebook hyperlink check
Given User is on contacts tab
When user clicks facebook hyperlink
Then corresponding facebook link should open

Scenario: Linkedin hyperlink check
Given User is on contacts tab
When user clicks linkedin hyperlink
Then corresponding linkedin link should open

Scenario: Twitter hyperlink check
Given User is on contacts tab
When user clicks twitter hyperlink
Then corresponding twitter link should open