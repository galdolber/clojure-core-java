package clojure;

import clojure.lang.*;

public final class xml_emit_element extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Keyword const__7;
 public static final clojure.lang.Var const__8;
 public static final java.lang.Object const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Keyword const__21;
 public static final clojure.lang.Var const__22;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)java.lang.String.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "tag");
  const__7 = (clojure.lang.Keyword)Keyword.intern(null, "attrs");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__9 = (java.lang.Object)0L;
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__21 = (clojure.lang.Keyword)Keyword.intern(null, "content");
  const__22 = (clojure.lang.Var)RT.var("clojure.xml", "emit-element");
 }
 public xml_emit_element() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object e1) {
  if ((e1 instanceof java.lang.String)) {
   return ((IFn)const__2.getRawRoot()).invoke(e1);
  } else {
   ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("<", ((IFn)const__5.getRawRoot()).invoke(RT.get(e1, Keyword.intern(null, "tag")))));
   Object __r4531 = RT.get(e1, Keyword.intern(null, "attrs"));
   if (__r4531 != null && !(__r4531 == Boolean.FALSE)) {
    {
     Object seq_69632 = ((IFn)const__8.getRawRoot()).invoke(RT.get(e1, Keyword.intern(null, "attrs")));
     Object chunk_69643 = null;
     long count_69654 = 0L;
     long i_69665 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_69665, (long)count_69654)) {
       {
        Object attr6 = ((java.lang.Object)((clojure.lang.Indexed)chunk_69643).nth((int)RT.intCast(i_69665)));
        ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(" ", ((IFn)const__5.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(attr6)), "='", ((IFn)const__12.getRawRoot()).invoke(attr6), "'"));
        long i_69665___aux = clojure.lang.Numbers.unchecked_inc((long)i_69665);
        i_69665 = i_69665___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__7 = ((IFn)const__8.getRawRoot()).invoke(seq_69632);
        Object __r4534 = temp__4117__auto__7;
        if (__r4534 != null && !(__r4534 == Boolean.FALSE)) {
         {
          Object seq_69638 = temp__4117__auto__7;
          Object __r4536 = ((IFn)const__14.getRawRoot()).invoke(seq_69638);
          if (__r4536 != null && !(__r4536 == Boolean.FALSE)) {
           {
            Object c__4343__auto__9 = ((IFn)const__15.getRawRoot()).invoke(seq_69638);
            java.lang.Object seq_69632___aux = ((IFn)const__16.getRawRoot()).invoke(seq_69638);
            java.lang.Object chunk_69643___aux = c__4343__auto__9;
            long count_69654___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__9)));
            long i_69665___aux = clojure.lang.RT.intCast((long)0L);
            seq_69632 = seq_69632___aux;
            chunk_69643 = chunk_69643___aux;
            count_69654 = count_69654___aux;
            i_69665 = i_69665___aux;
            continue;
           }
          } else {
           {
            Object attr10 = ((IFn)const__19.getRawRoot()).invoke(seq_69638);
            ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(" ", ((IFn)const__5.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(attr10)), "='", ((IFn)const__12.getRawRoot()).invoke(attr10), "'"));
            java.lang.Object seq_69632___aux = ((IFn)const__20.getRawRoot()).invoke(seq_69638);
            java.lang.Object chunk_69643___aux = null;
            long count_69654___aux = 0L;
            long i_69665___aux = 0L;
            seq_69632 = seq_69632___aux;
            chunk_69643 = chunk_69643___aux;
            count_69654 = count_69654___aux;
            i_69665 = i_69665___aux;
            continue;
           }
          }
         }
        } else {
        }
       }
      }
      break;
     }
    }
   } else {
   }
   Object __r4538 = RT.get(e1, Keyword.intern(null, "content"));
   if (__r4538 != null && !(__r4538 == Boolean.FALSE)) {
    ((IFn)const__2.getRawRoot()).invoke(">");
    {
     Object seq_696711 = ((IFn)const__8.getRawRoot()).invoke(RT.get(e1, Keyword.intern(null, "content")));
     Object chunk_696812 = null;
     long count_696913 = 0L;
     long i_697014 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_697014, (long)count_696913)) {
       {
        Object c15 = ((java.lang.Object)((clojure.lang.Indexed)chunk_696812).nth((int)RT.intCast(i_697014)));
        ((IFn)const__22.getRawRoot()).invoke(c15);
        long i_697014___aux = clojure.lang.Numbers.unchecked_inc((long)i_697014);
        i_697014 = i_697014___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__16 = ((IFn)const__8.getRawRoot()).invoke(seq_696711);
        Object __r4541 = temp__4117__auto__16;
        if (__r4541 != null && !(__r4541 == Boolean.FALSE)) {
         {
          Object seq_696717 = temp__4117__auto__16;
          Object __r4543 = ((IFn)const__14.getRawRoot()).invoke(seq_696717);
          if (__r4543 != null && !(__r4543 == Boolean.FALSE)) {
           {
            Object c__4343__auto__18 = ((IFn)const__15.getRawRoot()).invoke(seq_696717);
            java.lang.Object seq_696711___aux = ((IFn)const__16.getRawRoot()).invoke(seq_696717);
            java.lang.Object chunk_696812___aux = c__4343__auto__18;
            long count_696913___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__18)));
            long i_697014___aux = clojure.lang.RT.intCast((long)0L);
            seq_696711 = seq_696711___aux;
            chunk_696812 = chunk_696812___aux;
            count_696913 = count_696913___aux;
            i_697014 = i_697014___aux;
            continue;
           }
          } else {
           {
            Object c19 = ((IFn)const__19.getRawRoot()).invoke(seq_696717);
            ((IFn)const__22.getRawRoot()).invoke(c19);
            java.lang.Object seq_696711___aux = ((IFn)const__20.getRawRoot()).invoke(seq_696717);
            java.lang.Object chunk_696812___aux = null;
            long count_696913___aux = 0L;
            long i_697014___aux = 0L;
            seq_696711 = seq_696711___aux;
            chunk_696812 = chunk_696812___aux;
            count_696913 = count_696913___aux;
            i_697014 = i_697014___aux;
            continue;
           }
          }
         }
        } else {
        }
       }
      }
      break;
     }
    }
    return ((IFn)const__2.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke("</", ((IFn)const__5.getRawRoot()).invoke(RT.get(e1, Keyword.intern(null, "tag"))), ">"));
   } else {
    return ((IFn)const__2.getRawRoot()).invoke("/>");
   }
  }
 }
}
