/**
 * @author VISTALL
 * @since 16-Aug-22
 */
module consulo.library.flexmark
{
	requires transitive flexmark;
	requires transitive flexmark.util;
	requires transitive flexmark.util.ast;
	requires transitive flexmark.util.builder;
	requires transitive flexmark.util.collection;
	requires transitive flexmark.util.data;
	requires transitive flexmark.util.dependency;
	requires transitive flexmark.util.format;
	requires transitive flexmark.util.html;
	requires transitive flexmark.util.misc;
	requires transitive flexmark.util.options;
	requires transitive flexmark.util.sequence;
	requires transitive flexmark.util.visitor;
}