(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([[42],{FSIE:function(e,t,a){"use strict";var l=a("0ZgE"),r=a("VY4n");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,a("VNOo");var d=l(a("Rf9C"));a("PAjg");var n,u,s=l(a("k07Y")),c=r(a("ZS5U")),i=l(a("I9Uw")),m=a("rAnT"),f=l(a("pUXw")),o=l(a("wgDz")),p=(n=(0,m.connect)(e=>{var t=e.list;return{list:t}}),n(u=class extends c.PureComponent{render(){var e=this.props.list.list;return c.default.createElement(d.default,{className:o.default.coverCardList,rowKey:"id",grid:{gutter:24,xxl:3,xl:2,lg:2,md:2,sm:2,xs:1},dataSource:e,renderItem:e=>c.default.createElement(d.default.Item,null,c.default.createElement(s.default,{className:o.default.card,hoverable:!0,cover:c.default.createElement("img",{alt:e.title,src:e.cover})},c.default.createElement(s.default.Meta,{title:c.default.createElement("a",null,e.title),description:e.subDescription}),c.default.createElement("div",{className:o.default.cardItemContent},c.default.createElement("span",null,(0,i.default)(e.updatedAt).fromNow()),c.default.createElement("div",{className:o.default.avatarList},c.default.createElement(f.default,{size:"mini"},e.members.map(t=>c.default.createElement(f.default.Item,{key:`${e.id}-avatar-${t.id}`,src:t.avatar,tips:t.name})))))))})}})||u),v=p;t.default=v}}]);