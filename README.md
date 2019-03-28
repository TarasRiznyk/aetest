# AgileEngine backend-XML java snippets



Some of the criterias are not implemented  
You can add 3rd parameter as Id of the element  

## 1 Case

Params: ./samples/htmls/sample-0-origin.html   ./samples/htmls/sample-1-evil-gemini.html

Output: 

[INFO] 2019-03-28 22:10:42,701 c.a.c.VisibleTextCriteria - Learned element's visible text Make everything OK
[INFO] 2019-03-28 22:10:42,702 c.a.c.ClassNameCriteria - Learned element's visible text btn btn-success
[INFO] 2019-03-28 22:10:42,702 c.a.c.HrefCriteria - Learned element's visible text #ok
[INFO] 2019-03-28 22:10:42,729 c.a.c.ClassNameCriteria - Element's ClassName matched learned ClassName btn btn-success
[INFO] 2019-03-28 22:10:42,733 c.a.c.HrefCriteria - Element's Href matched learned href btn btn-danger
[INFO] 2019-03-28 22:10:42,733 c.a.c.VisibleTextCriteria - Element's visible text matched learned text Make everything OK
[INFO] 2019-03-28 22:10:42,733 c.a.c.ClassNameCriteria - Element's ClassName matched learned ClassName btn btn-success
[INFO] 2019-03-28 22:10:42,742 c.a.Main - 

Element found:
page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > a.btn.btn-success 
Matched score 2 of 3 
Criteria matched: 
Visible Text Criteria, ClassName criteria


## 2 Case

Params: ./samples/htmls/sample-0-origin.html ./samples/htmls/sample-2-container-and-clone.html

Output: 
[INFO] 2019-03-28 22:11:14,883 c.a.c.VisibleTextCriteria - Learned element's visible text Make everything OK
[INFO] 2019-03-28 22:11:14,884 c.a.c.ClassNameCriteria - Learned element's visible text btn btn-success
[INFO] 2019-03-28 22:11:14,885 c.a.c.HrefCriteria - Learned element's visible text #ok
[INFO] 2019-03-28 22:11:14,915 c.a.c.VisibleTextCriteria - Element's visible text matched learned text Make everything OK
[INFO] 2019-03-28 22:11:14,915 c.a.c.HrefCriteria - Element's Href matched learned href btn test-link-ok
[INFO] 2019-03-28 22:11:14,915 c.a.c.VisibleTextCriteria - Element's visible text matched learned text Make everything OK
[INFO] 2019-03-28 22:11:14,924 c.a.Main - 

Element found:
page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > div.some-container > a.btn.test-link-ok 
Matched score 2 of 3 
Criteria matched: 
Visible Text Criteria, Href criteria


## 3 Case:
Params:  ./samples/htmls/sample-0-origin.html ./samples/htmls/sample-3-the-escape.html

[INFO] 2019-03-28 22:12:04,744 c.a.c.VisibleTextCriteria - Learned element's visible text Make everything OK
[INFO] 2019-03-28 22:12:04,745 c.a.c.ClassNameCriteria - Learned element's visible text btn btn-success
[INFO] 2019-03-28 22:12:04,745 c.a.c.HrefCriteria - Learned element's visible text #ok
[INFO] 2019-03-28 22:12:04,776 c.a.c.HrefCriteria - Element's Href matched learned href btn btn-warning
[INFO] 2019-03-28 22:12:04,777 c.a.c.ClassNameCriteria - Element's ClassName matched learned ClassName btn btn-success
[INFO] 2019-03-28 22:12:04,777 c.a.c.HrefCriteria - Element's Href matched learned href btn btn-success
[INFO] 2019-03-28 22:12:04,785 c.a.Main - 

Element found:
 page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success 
Matched score 2 of 3 
Criteria matched: 
ClassName criteria, Href criteria


##4 Case: 

Params:  ./samples/htmls/sample-0-origin.html ./samples/htmls/sample-4-the-mash.html

2 Elements are found because of lacking some criterias

Output: 

[INFO] 2019-03-28 22:13:17,825 c.a.c.VisibleTextCriteria - Learned element's visible text Make everything OK
[INFO] 2019-03-28 22:13:17,826 c.a.c.ClassNameCriteria - Learned element's visible text btn btn-success
[INFO] 2019-03-28 22:13:17,826 c.a.c.HrefCriteria - Learned element's visible text #ok
[INFO] 2019-03-28 22:13:17,847 c.a.c.VisibleTextCriteria - Element's visible text matched learned text Make everything OK
[INFO] 2019-03-28 22:13:17,848 c.a.c.ClassNameCriteria - Element's ClassName matched learned ClassName btn btn-success
[INFO] 2019-03-28 22:13:17,848 c.a.c.ClassNameCriteria - Element's ClassName matched learned ClassName btn btn-success
[INFO] 2019-03-28 22:13:17,848 c.a.c.HrefCriteria - Element's Href matched learned href btn btn-success
[INFO] 2019-03-28 22:13:17,856 c.a.Main - 

Element found:
 page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-body > button.btn.btn-success 
Matched score 2 of 3 
Criteria matched: 
Visible Text Criteria, ClassName criteria
[INFO] 2019-03-28 22:13:17,857 c.a.Main - 

Element found:
 page-wrapper > div.row:nth-child(3) > div.col-lg-8 > div.panel.panel-default > div.panel-footer > a.btn.btn-success 
Matched score 2 of 3 
Criteria matched: 
ClassName criteria, Href criteria
