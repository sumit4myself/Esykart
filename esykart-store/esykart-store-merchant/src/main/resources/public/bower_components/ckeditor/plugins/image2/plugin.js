/*
 Copyright (c) 2003-2015, CKSource - Frederico Knabben. All rights reserved.
 For licensing, see LICENSE.md or http://ckeditor.com/license
*/
(function(){function D(a){function b(){this.deflated||(a.widgets.focused==this.widget&&(this.focused=!0),a.widgets.destroy(this.widget),this.deflated=!0)}function e(){var d=a.editable(),c=a.document;if(this.deflated)this.widget=a.widgets.initOn(this.element,"image",this.widget.data),this.widget.inline&&!(new CKEDITOR.dom.elementPath(this.widget.wrapper,d)).block&&(d=c.createElement(a.activeEnterMode==CKEDITOR.ENTER_P?"p":"div"),d.replace(this.widget.wrapper),this.widget.wrapper.move(d)),this.focused&&
(this.widget.focus(),delete this.focused),delete this.deflated;else{var b=this.widget,d=f,c=b.wrapper,e=b.data.align,b=b.data.hasCaption;if(d){for(var l=3;l--;)c.removeClass(d[l]);"center"==e?b&&c.addClass(d[1]):"none"!=e&&c.addClass(d[q[e]])}else"center"==e?(b?c.setStyle("text-align","center"):c.removeStyle("text-align"),c.removeStyle("float")):("none"==e?c.removeStyle("float"):c.setStyle("float",e),c.removeStyle("text-align"))}}var f=a.config.image2_alignClasses,g=a.config.image2_captionedClass;
return{allowedContent:E(a),requiredContent:"img[src,alt]",features:F(a),styleableElements:"img figure",contentTransformations:[["img[width]: sizeToAttribute"]],editables:{caption:{selector:"figcaption",allowedContent:"br em strong sub sup u s; a[!href]"}},parts:{image:"img",caption:"figcaption"},dialog:"image2",template:'\x3cimg alt\x3d"" src\x3d"" /\x3e',data:function(){var d=this.features;this.data.hasCaption&&!a.filter.checkFeature(d.caption)&&(this.data.hasCaption=!1);"none"==this.data.align||
a.filter.checkFeature(d.align)||(this.data.align="none");this.shiftState({widget:this,element:this.element,oldData:this.oldData,newData:this.data,deflate:b,inflate:e});this.data.link?this.parts.link||(this.parts.link=this.parts.image.getParent()):this.parts.link&&delete this.parts.link;this.parts.image.setAttributes({src:this.data.src,"data-cke-saved-src":this.data.src,alt:this.data.alt});if(this.oldData&&!this.oldData.hasCaption&&this.data.hasCaption)for(var c in this.data.classes)this.parts.image.removeClass(c);
if(a.filter.checkFeature(d.dimension)){d=this.data;d={width:d.width,height:d.height};c=this.parts.image;for(var f in d)d[f]?c.setAttribute(f,d[f]):c.removeAttribute(f)}this.oldData=CKEDITOR.tools.extend({},this.data)},init:function(){var b=CKEDITOR.plugins.image2,c=this.parts.image,e={hasCaption:!!this.parts.caption,src:c.getAttribute("src"),alt:c.getAttribute("alt")||"",width:c.getAttribute("width")||"",height:c.getAttribute("height")||"",lock:this.ready?b.checkHasNaturalRatio(c):!0},g=c.getAscendant("a");
g&&this.wrapper.contains(g)&&(this.parts.link=g);e.align||(c=e.hasCaption?this.element:c,f?(c.hasClass(f[0])?e.align="left":c.hasClass(f[2])&&(e.align="right"),e.align?c.removeClass(f[q[e.align]]):e.align="none"):(e.align=c.getStyle("float")||"none",c.removeStyle("float")));a.plugins.link&&this.parts.link&&(e.link=b.getLinkAttributesParser()(a,this.parts.link),(c=e.link.advanced)&&c.advCSSClasses&&(c.advCSSClasses=CKEDITOR.tools.trim(c.advCSSClasses.replace(/cke_\S+/,""))));this.wrapper[(e.hasCaption?
"remove":"add")+"Class"]("cke_image_nocaption");this.setData(e);a.filter.checkFeature(this.features.dimension)&&!0!==a.config.image2_disableResizer&&G(this);this.shiftState=b.stateShifter(this.editor);this.on("contextMenu",function(a){a.data.image=CKEDITOR.TRISTATE_OFF;if(this.parts.link||this.wrapper.getAscendant("a"))a.data.link=a.data.unlink=CKEDITOR.TRISTATE_OFF});this.on("dialog",function(a){a.data.widget=this},this)},addClass:function(a){m(this).addClass(a)},hasClass:function(a){return m(this).hasClass(a)},
removeClass:function(a){m(this).removeClass(a)},getClasses:function(){var a=new RegExp("^("+[].concat(g,f).join("|")+")$");return function(){var b=this.repository.parseElementClasses(m(this).getAttribute("class")),e;for(e in b)a.test(e)&&delete b[e];return b}}(),upcast:H(a),downcast:I(a)}}function H(a){var b=n(a),e=a.config.image2_captionedClass;return function(a,g){var d={width:1,height:1},c=a.name,h;if(!a.attributes["data-cke-realelement"]&&(b(a)?("div"==c&&(h=a.getFirst("figure"))&&(a.replaceWith(h),
a=h),g.align="center",h=a.getFirst("img")||a.getFirst("a").getFirst("img")):"figure"==c&&a.hasClass(e)?h=a.getFirst("img")||a.getFirst("a").getFirst("img"):r(a)&&(h="a"==a.name?a.children[0]:a),h)){for(var C in d)(d=h.attributes[C])&&d.match(J)&&delete h.attributes[C];return a}}}function I(a){var b=a.config.image2_alignClasses;return function(a){var f="a"==a.name?a.getFirst():a,g=f.attributes,d=this.data.align;if(!this.inline){var c=a.getFirst("span");c&&c.replaceWith(c.getFirst({img:1,a:1}))}d&&
"none"!=d&&(c=CKEDITOR.tools.parseCssText(g.style||""),"center"==d&&"figure"==a.name?a=a.wrapWith(new CKEDITOR.htmlParser.element("div",b?{"class":b[1]}:{style:"text-align:center"})):d in{left:1,right:1}&&(b?f.addClass(b[q[d]]):c["float"]=d),b||CKEDITOR.tools.isEmpty(c)||(g.style=CKEDITOR.tools.writeCssText(c)));return a}}function n(a){var b=a.config.image2_captionedClass,e=a.config.image2_alignClasses,f={figure:1,a:1,img:1};return function(g){if(!(g.name in{div:1,p:1}))return!1;var d=g.children;
if(1!==d.length)return!1;d=d[0];if(!(d.name in f))return!1;if("p"==g.name){if(!r(d))return!1}else if("figure"==d.name){if(!d.hasClass(b))return!1}else if(a.enterMode==CKEDITOR.ENTER_P||!r(d))return!1;return(e?g.hasClass(e[1]):"center"==CKEDITOR.tools.parseCssText(g.attributes.style||"",!0)["text-align"])?!0:!1}}function r(a){return"img"==a.name?!0:"a"==a.name?1==a.children.length&&a.getFirst("img"):!1}function G(a){var b=a.editor,e=b.editable(),f=b.document,g=a.resizer=f.createElement("span");g.addClass("cke_image_resizer");
g.setAttribute("title",b.lang.image2.resizer);g.append(new CKEDITOR.dom.text("​",f));if(a.inline)a.wrapper.append(g);else{var d=a.parts.link||a.parts.image,c=d.getParent(),h=f.createElement("span");h.addClass("cke_image_resizer_wrapper");h.append(d);h.append(g);a.element.append(h,!0);c.is("span")&&c.remove()}g.on("mousedown",function(c){function l(a,b,c){var d=CKEDITOR.document,l=[];f.equals(d)||l.push(d.on(a,b));l.push(f.on(a,b));if(c)for(a=l.length;a--;)c.push(l.pop())}function d(){t=m+A*x;u=Math.round(t/
v)}function w(){u=q-p;t=Math.round(u*v)}var h=a.parts.image,A="right"==a.data.align?-1:1,k=c.data.$.screenX,K=c.data.$.screenY,m=h.$.clientWidth,q=h.$.clientHeight,v=m/q,n=[],r="cke_image_s"+(~A?"e":"w"),B,t,u,z,x,p,y;b.fire("saveSnapshot");l("mousemove",function(a){B=a.data.$;x=B.screenX-k;p=K-B.screenY;y=Math.abs(x/p);1==A?0>=x?0>=p?d():y>=v?d():w():0>=p?y>=v?w():d():w():0>=x?0>=p?y>=v?w():d():w():0>=p?d():y>=v?d():w();15<=t&&15<=u?(h.setAttributes({width:t,height:u}),z=!0):z=!1},n);l("mouseup",
function(){for(var c;c=n.pop();)c.removeListener();e.removeClass(r);g.removeClass("cke_image_resizing");z&&(a.setData({width:t,height:u}),b.fire("saveSnapshot"));z=!1},n);e.addClass(r);g.addClass("cke_image_resizing")});a.on("data",function(){g["right"==a.data.align?"addClass":"removeClass"]("cke_image_resizer_left")})}function L(a){var b=[],e;return function(f){var g=a.getCommand("justify"+f);if(g){b.push(function(){g.refresh(a,a.elementPath())});if(f in{right:1,left:1,center:1})g.on("exec",function(d){var c=
k(a);if(c){c.setData("align",f);for(c=b.length;c--;)b[c]();d.cancel()}});g.on("refresh",function(b){var c=k(a),g={right:1,left:1,center:1};c&&(void 0===e&&(e=a.filter.checkFeature(a.widgets.registered.image.features.align)),e?this.setState(c.data.align==f?CKEDITOR.TRISTATE_ON:f in g?CKEDITOR.TRISTATE_OFF:CKEDITOR.TRISTATE_DISABLED):this.setState(CKEDITOR.TRISTATE_DISABLED),b.cancel())})}}}function M(a){a.plugins.link&&(CKEDITOR.on("dialogDefinition",function(b){b=b.data;if("link"==b.name){b=b.definition;
var e=b.onShow,f=b.onOk;b.onShow=function(){var b=k(a);b&&(b.inline?!b.wrapper.getAscendant("a"):1)?this.setupContent(b.data.link||{}):e.apply(this,arguments)};b.onOk=function(){var b=k(a);if(b&&(b.inline?!b.wrapper.getAscendant("a"):1)){var d={};this.commitContent(d);b.setData("link",d)}else f.apply(this,arguments)}}}),a.getCommand("unlink").on("exec",function(b){var e=k(a);e&&e.parts.link&&(e.setData("link",null),this.refresh(a,a.elementPath()),b.cancel())}),a.getCommand("unlink").on("refresh",
function(b){var e=k(a);e&&(this.setState(e.data.link||e.wrapper.getAscendant("a")?CKEDITOR.TRISTATE_OFF:CKEDITOR.TRISTATE_DISABLED),b.cancel())}))}function k(a){return(a=a.widgets.focused)&&"image"==a.name?a:null}function E(a){var b=a.config.image2_alignClasses;a={div:{match:n(a)},p:{match:n(a)},img:{attributes:"!src,alt,width,height"},figure:{classes:"!"+a.config.image2_captionedClass},figcaption:!0};b?(a.div.classes=b[1],a.p.classes=a.div.classes,a.img.classes=b[0]+","+b[2],a.figure.classes+=","+
a.img.classes):(a.div.styles="text-align",a.p.styles="text-align",a.img.styles="float",a.figure.styles="float,display");return a}function F(a){a=a.config.image2_alignClasses;return{dimension:{requiredContent:"img[width,height]"},align:{requiredContent:"img"+(a?"("+a[0]+")":"{float}")},caption:{requiredContent:"figcaption"}}}function m(a){return a.data.hasCaption?a.element:a.parts.image}var N=new CKEDITOR.template('\x3cfigure class\x3d"{captionedClass}"\x3e\x3cimg alt\x3d"" src\x3d"" /\x3e\x3cfigcaption\x3e{captionPlaceholder}\x3c/figcaption\x3e\x3c/figure\x3e'),
q={left:0,center:1,right:2},J=/^\s*(\d+\%)\s*$/i;CKEDITOR.plugins.add("image2",{lang:"af,ar,bg,bn,bs,ca,cs,cy,da,de,el,en,en-au,en-ca,en-gb,eo,es,et,eu,fa,fi,fo,fr,fr-ca,gl,gu,he,hi,hr,hu,id,is,it,ja,ka,km,ko,ku,lt,lv,mk,mn,ms,nb,nl,no,pl,pt,pt-br,ro,ru,si,sk,sl,sq,sr,sr-latn,sv,th,tr,tt,ug,uk,vi,zh,zh-cn",requires:"widget,dialog",icons:"image",hidpi:!0,onLoad:function(){CKEDITOR.addCss(".cke_image_nocaption{line-height:0}.cke_editable.cke_image_sw, .cke_editable.cke_image_sw *{cursor:sw-resize !important}.cke_editable.cke_image_se, .cke_editable.cke_image_se *{cursor:se-resize !important}.cke_image_resizer{display:none;position:absolute;width:10px;height:10px;bottom:-5px;right:-5px;background:#000;outline:1px solid #fff;line-height:0;cursor:se-resize;}.cke_image_resizer_wrapper{position:relative;display:inline-block;line-height:0;}.cke_image_resizer.cke_image_resizer_left{right:auto;left:-5px;cursor:sw-resize;}.cke_widget_wrapper:hover .cke_image_resizer,.cke_image_resizer.cke_image_resizing{display:block}.cke_widget_wrapper\x3ea{display:inline-block}")},
init:function(a){var b=a.config,e=a.lang.image2,f=D(a);b.filebrowserImage2BrowseUrl=b.filebrowserImageBrowseUrl;b.filebrowserImage2UploadUrl=b.filebrowserImageUploadUrl;f.pathName=e.pathName;f.editables.caption.pathName=e.pathNameCaption;a.widgets.add("image",f);a.ui.addButton&&a.ui.addButton("Image",{label:a.lang.common.image,command:"image",toolbar:"insert,10"});a.contextMenu&&(a.addMenuGroup("image",10),a.addMenuItem("image",{label:e.menu,command:"image",group:"image"}));CKEDITOR.dialog.add("image2",
this.path+"dialogs/image2.js")},afterInit:function(a){var b={left:1,right:1,center:1,block:1},e=L(a),f;for(f in b)e(f);M(a)}});CKEDITOR.plugins.image2={stateShifter:function(a){function b(a,b){var c={};g?c.attributes={"class":g[1]}:c.styles={"text-align":"center"};c=f.createElement(a.activeEnterMode==CKEDITOR.ENTER_P?"p":"div",c);e(c,b);b.move(c);return c}function e(b,d){if(d.getParent()){var e=a.createRange();e.moveToPosition(d,CKEDITOR.POSITION_BEFORE_START);d.remove();c.insertElementIntoRange(b,
e)}else b.replace(d)}var f=a.document,g=a.config.image2_alignClasses,d=a.config.image2_captionedClass,c=a.editable(),h=["hasCaption","align","link"],k={align:function(c,d,e){var f=c.element;c.changed.align?c.newData.hasCaption||("center"==e&&(c.deflate(),c.element=b(a,f)),c.changed.hasCaption||"center"!=d||"center"==e||(c.deflate(),d=f.findOne("a,img"),d.replace(f),c.element=d)):"center"==e&&c.changed.hasCaption&&!c.newData.hasCaption&&(c.deflate(),c.element=b(a,f));!g&&f.is("figure")&&("center"==
e?f.setStyle("display","inline-block"):f.removeStyle("display"))},hasCaption:function(b,c,g){b.changed.hasCaption&&(c=b.element.is({img:1,a:1})?b.element:b.element.findOne("a,img"),b.deflate(),g?(g=CKEDITOR.dom.element.createFromHtml(N.output({captionedClass:d,captionPlaceholder:a.lang.image2.captionPlaceholder}),f),e(g,b.element),c.replace(g.findOne("img")),b.element=g):(c.replace(b.element),b.element=c))},link:function(b,c,d){if(b.changed.link){var e=b.element.is("img")?b.element:b.element.findOne("img"),
g=b.element.is("a")?b.element:b.element.findOne("a"),h=b.element.is("a")&&!d||b.element.is("img")&&d,k;h&&b.deflate();d?(c||(k=f.createElement("a",{attributes:{href:b.newData.link.url}}),k.replace(e),e.move(k)),d=CKEDITOR.plugins.image2.getLinkAttributesGetter()(a,d),CKEDITOR.tools.isEmpty(d.set)||(k||g).setAttributes(d.set),d.removed.length&&(k||g).removeAttributes(d.removed)):(d=g.findOne("img"),d.replace(g),k=d);h&&(b.element=k)}}};return function(a){var b,c;a.changed={};for(c=0;c<h.length;c++)b=
h[c],a.changed[b]=a.oldData?a.oldData[b]!==a.newData[b]:!1;for(c=0;c<h.length;c++)b=h[c],k[b](a,a.oldData?a.oldData[b]:null,a.newData[b]);a.inflate()}},checkHasNaturalRatio:function(a){var b=a.$;a=this.getNatural(a);return Math.round(b.clientWidth/a.width*a.height)==b.clientHeight||Math.round(b.clientHeight/a.height*a.width)==b.clientWidth},getNatural:function(a){if(a.$.naturalWidth)a={width:a.$.naturalWidth,height:a.$.naturalHeight};else{var b=new Image;b.src=a.getAttribute("src");a={width:b.width,
height:b.height}}return a},getLinkAttributesGetter:function(){return CKEDITOR.plugins.link.getLinkAttributes},getLinkAttributesParser:function(){return CKEDITOR.plugins.link.parseLinkAttributes}}})();CKEDITOR.config.image2_captionedClass="image";