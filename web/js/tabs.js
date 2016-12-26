/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function changeDesc(desc) {
    var clickedTab = document.getElementById(desc);
    var tabs = clickedTab.parentNode.children;

    for (var i = 0; i < tabs.length; i++) {
        var tab = tabs[i];
//        tab.className += '';
        tab.className = tab.className.replace(/active/g, '');
        var content = document.getElementById(tab.id + 'Tab');
        content.style.display = 'none';
    }

    clickedTab.className += ' active';
    var curContent = document.getElementById(clickedTab.id + 'Tab');
    curContent.style.display = 'block';
}

function clickDefaultTabs(defaultTab) {
    var tabs = document.querySelectorAll('.tabs');
    for (var i = 0; i < tabs.length; i++) {
        if (defaultTab < tabs[i].children.length && defaultTab >= 0) {
            tabs[i].children[defaultTab].click();
        } else {
            tabs[i].children[0].click();
        }
    }
}