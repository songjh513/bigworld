(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[28],{USAq:function(e,t,a){"use strict";var r=a("0ZgE"),l=a("VY4n");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("f+r1");var n,c,s=r(a("cJq7")),o=l(a("ZS5U")),i=r(a("bfKc")),p=a("rAnT"),u=r(a("zHco")),h=(n=(0,p.connect)(),n(c=class extends o.Component{constructor(){super(...arguments),this.handleTabChange=(e=>{var t=this.props.match;switch(e){case"articles":i.default.push(`${t.url}/articles`);break;case"applications":i.default.push(`${t.url}/applications`);break;case"projects":i.default.push(`${t.url}/projects`);break;default:break}}),this.handleFormSubmit=(e=>{console.log(e)})}render(){var e=[{key:"articles",tab:"\u6587\u7ae0"},{key:"projects",tab:"\u9879\u76ee"},{key:"applications",tab:"\u5e94\u7528"}],t=o.default.createElement("div",{style:{textAlign:"center"}},o.default.createElement(s.default.Search,{placeholder:"\u8bf7\u8f93\u5165",enterButton:"\u641c\u7d22",size:"large",onSearch:this.handleFormSubmit,style:{width:522}})),a=this.props,r=a.match,l=a.children,n=a.location;return o.default.createElement(u.default,{title:"\u641c\u7d22\u5217\u8868",content:t,tabList:e,tabActiveKey:n.pathname.replace(`${r.path}/`,""),onTabChange:this.handleTabChange},l)}})||c),d=h;t.default=d}}]);