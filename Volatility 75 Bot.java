<xml xmlns="http://www.w3.org/1999/xhtml" is_dbot="true" collection="false">
  <variables>
    <variable type="" id="7O0^KGEFXjUXczC*,3?O" islocal="false" iscloud="false">Max Loss Amount</variable>
    <variable type="" id="oAE;A-n$mSwY25a#87z5" islocal="false" iscloud="false">RSI</variable>
    <variable type="" id="pG+F3kX1nbZ0d7R))Tya" islocal="false" iscloud="false">Expected Profit</variable>
    <variable type="" id="xIeIoQ.[=1[r+%M;)gZH" islocal="false" iscloud="false">Initial Amount</variable>
    <variable type="" id="u}Yu/hNtN:S^^V!K(3V)" islocal="false" iscloud="false">Win Amount</variable>
    <variable type="" id="l,}@Mn6TU[7y.A57bdW1" islocal="false" iscloud="false">text</variable>
    <variable type="" id="J)p~w};W`R8Tk85G|czO" islocal="false" iscloud="false">text1</variable>
    <variable type="" id="3^CbE.FT|a?KgND:G.6F" islocal="false" iscloud="false">text2</variable>
    <variable type="" id="2Xl$jzJnXU+PSon]xl*C" islocal="false" iscloud="false">text3</variable>
    <variable type="" id=":+:e?#}WbeHw6|F@%0jy" islocal="false" iscloud="false">rsi</variable>
    <variable type="" id="m8O$RLbSJ4_j_*]rR[05" islocal="false" iscloud="false">text4</variable>
  </variables>
  <block type="trade_definition" id="14weIy@(UU{Xfx7d6ie6" x="0" y="0">
    <statement name="TRADE_OPTIONS">
      <block type="trade_definition_market" id="n2WT3(j2N=,qZuG+zLJ+" deletable="false" movable="false">
        <field name="MARKET_LIST">synthetic_index</field>
        <field name="SUBMARKET_LIST">random_index</field>
        <field name="SYMBOL_LIST">R_75</field>
        <next>
          <block type="trade_definition_tradetype" id="=MByw1!J4%GkCS8{939H" deletable="false" movable="false">
            <field name="TRADETYPECAT_LIST">callput</field>
            <field name="TRADETYPE_LIST">callput</field>
            <next>
              <block type="trade_definition_contracttype" id="a$$VQk-;8Qun)}T|PdQK" deletable="false" movable="false">
                <field name="TYPE_LIST">both</field>
                <next>
                  <block type="trade_definition_candleinterval" id="0Dl/*09:l~C=3tqu_izG" deletable="false" movable="false">
                    <field name="CANDLEINTERVAL_LIST">60</field>
                    <next>
                      <block type="trade_definition_restartbuysell" id="hta{3Km(vND(J!]a*5yU" deletable="false" movable="false">
                        <field name="TIME_MACHINE_ENABLED">FALSE</field>
                        <next>
                          <block type="trade_definition_restartonerror" id="oS{+{yLOT`9Nq:A3%f{y" deletable="false" movable="false">
                            <field name="RESTARTONERROR">TRUE</field>
                          </block>
                        </next>
                      </block>
                    </next>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </next>
      </block>
    </statement>
    <statement name="INITIALIZATION">
      <block type="variables_set" id="6ie~i(DQMNDiWWDZ@*==">
        <field name="VAR" id="7O0^KGEFXjUXczC*,3?O" variabletype="">Max Loss Amount</field>
        <value name="VALUE">
          <block type="math_number" id="^nXIwGTK,2GKV949_{q=">
            <field name="NUM">100</field>
          </block>
        </value>
        <next>
          <block type="variables_set" id="F{[O.J3|k4l!#oJND;V=">
            <field name="VAR" id="pG+F3kX1nbZ0d7R))Tya" variabletype="">Expected Profit</field>
            <value name="VALUE">
              <block type="math_number" id="W[bOo{c8fC]V[1tpp6z3">
                <field name="NUM">50</field>
              </block>
            </value>
            <next>
              <block type="variables_set" id="$ZhUQPbFR:hf]Ru$2aYh">
                <field name="VAR" id="u}Yu/hNtN:S^^V!K(3V)" variabletype="">Win Amount</field>
                <value name="VALUE">
                  <block type="math_number" id="6.ZPT^+I`EQ18iGHj2v$">
                    <field name="NUM">1</field>
                  </block>
                </value>
                <next>
                  <block type="variables_set" id="3u:)%?dd_8w`qQIcAbbF">
                    <field name="VAR" id="xIeIoQ.[=1[r+%M;)gZH" variabletype="">Initial Amount</field>
                    <value name="VALUE">
                      <block type="math_number" id="Ne2`Cd#izK*UzjvA]+EN">
                        <field name="NUM">1</field>
                      </block>
                    </value>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </next>
      </block>
    </statement>
    <statement name="SUBMARKET">
      <block type="trade_definition_tradeoptions" id="/Z$Uc,HoFIZo$,HMc4lk">
        <mutation has_first_barrier="false" has_second_barrier="false" has_prediction="false"></mutation>
        <field name="DURATIONTYPE_LIST">t</field>
        <value name="DURATION">
          <block type="math_number" id="*.QY0VY`oM+.Ryh+MMxa">
            <field name="NUM">7</field>
          </block>
        </value>
        <value name="AMOUNT">
          <block type="variables_get" id="keKh^dB`D.5lsW@TeNLC">
            <field name="VAR" id="xIeIoQ.[=1[r+%M;)gZH" variabletype="">Initial Amount</field>
          </block>
        </value>
      </block>
    </statement>
  </block>
  <block type="during_purchase" id="OlRp09m:*pAX_T)~E4k]" x="776" y="0"></block>
  <block type="after_purchase" id="D17Kc^0;?j3`Sfs38z~M" x="776" y="160">
    <statement name="AFTERPURCHASE_STACK">
      <block type="controls_if" id="4^jh3{x329]e}16R9o!v">
        <mutation else="1"></mutation>
        <value name="IF0">
          <block type="contract_check_result" id="k]+%s8i2t``N3!:iu5p!">
            <field name="CHECK_RESULT">win</field>
          </block>
        </value>
        <statement name="DO0">
          <block type="text_join" id="ZTabMc8~`tKWX(xhorUs">
            <field name="VARIABLE" id="l,}@Mn6TU[7y.A57bdW1" variabletype="">text</field>
            <statement name="STACK">
              <block type="text_statement" id="sk-pn@BH-h%;J^*hM=5f">
                <value name="TEXT">
                  <shadow type="text" id="L2Z:|O_ItY$USzk?$o@%">
                    <field name="TEXT"></field>
                  </shadow>
                  <block type="text" id="b#aj=yIa*@%c!r}1(!oh">
                    <field name="TEXT">Won:</field>
                  </block>
                </value>
                <next>
                  <block type="text_statement" id="-%E-]:H,v0},L-[y.A46">
                    <value name="TEXT">
                      <shadow type="text" id="O,$n(7M7a-lq`*VirD?7">
                        <field name="TEXT"></field>
                      </shadow>
                      <block type="read_details" id="rNUszX5|#n/`EV?r_z8K">
                        <field name="DETAIL_INDEX">4</field>
                      </block>
                    </value>
                  </block>
                </next>
              </block>
            </statement>
            <next>
              <block type="notify" id="A*{0_iwRgA`3fW3,40Uq">
                <field name="NOTIFICATION_TYPE">success</field>
                <field name="NOTIFICATION_SOUND">silent</field>
                <value name="MESSAGE">
                  <block type="variables_get" id="f8d)W{0fbxqF(!=~B_C|">
                    <field name="VAR" id="l,}@Mn6TU[7y.A57bdW1" variabletype="">text</field>
                  </block>
                </value>
                <next>
                  <block type="variables_set" id="1jgbTz2EcNxM+VN8O/sm">
                    <field name="VAR" id="xIeIoQ.[=1[r+%M;)gZH" variabletype="">Initial Amount</field>
                    <value name="VALUE">
                      <block type="variables_get" id="iX[Ph5;1wW2Ynu^v(FOa">
                        <field name="VAR" id="u}Yu/hNtN:S^^V!K(3V)" variabletype="">Win Amount</field>
                      </block>
                    </value>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </statement>
        <statement name="ELSE">
          <block type="text_join" id="YM|jMip%{2yg,$HN1+#=">
            <field name="VARIABLE" id="J)p~w};W`R8Tk85G|czO" variabletype="">text1</field>
            <statement name="STACK">
              <block type="text_statement" id="O5z!=p94+#4_g4sR5l;+">
                <value name="TEXT">
                  <shadow type="text" id="-MV_=3;HQ|4;5?gZR=da">
                    <field name="TEXT"></field>
                  </shadow>
                  <block type="text" id="za,e2tZW^v[V56r}SHoO">
                    <field name="TEXT">Lost: </field>
                  </block>
                </value>
                <next>
                  <block type="text_statement" id=")_1InYz4yj_kuDwv,uk?">
                    <value name="TEXT">
                      <shadow type="text" id="i@[G_O0j{=aFVWZQKjvI">
                        <field name="TEXT"></field>
                      </shadow>
                    </value>
                  </block>
                </next>
              </block>
            </statement>
            <next>
              <block type="notify" id="VcAx!4FI#21L^CM0*I$S">
                <field name="NOTIFICATION_TYPE">warn</field>
                <field name="NOTIFICATION_SOUND">silent</field>
                <value name="MESSAGE">
                  <block type="variables_get" id="@-TMEYpTq:`Y|cT3MO[r">
                    <field name="VAR" id="J)p~w};W`R8Tk85G|czO" variabletype="">text1</field>
                  </block>
                </value>
                <next>
                  <block type="math_change" id="2:?W.AFn/Z8^!qw?X[8V">
                    <field name="VAR" id="xIeIoQ.[=1[r+%M;)gZH" variabletype="">Initial Amount</field>
                    <value name="DELTA">
                      <shadow type="math_number" id="m+qgJx?GzBDJZ4aPagMl">
                        <field name="NUM">1</field>
                      </shadow>
                      <block type="math_arithmetic" id="r.1g3?%a@EH)I5?WhNv+">
                        <field name="OP">MULTIPLY</field>
                        <value name="A">
                          <shadow type="math_number" id="O*YS%v;Hd;.OzG5$?~YZ">
                            <field name="NUM">1</field>
                          </shadow>
                          <block type="math_single" id=",`*b-cT1!V~`pH)w,YWX">
                            <field name="OP">ABS</field>
                            <value name="NUM">
                              <shadow type="math_number" id="U3Zp%a5~7}NL.fRi9cLK">
                                <field name="NUM">9</field>
                              </shadow>
                              <block type="read_details" id="ydy/lBCszYx:wZy6c`9@">
                                <field name="DETAIL_INDEX">4</field>
                              </block>
                            </value>
                          </block>
                        </value>
                        <value name="B">
                          <shadow type="math_number" id="H3i+@x4|0#5c.e^Oz01M">
                            <field name="NUM">1</field>
                          </shadow>
                          <block type="math_number" id="ot:$OOFgQWECz=.-6,J=">
                            <field name="NUM">1.041</field>
                          </block>
                        </value>
                      </block>
                    </value>
                    <next>
                      <block type="controls_if" id="K-0sRJV@y=ox]1GO`osn">
                        <value name="IF0">
                          <block type="logic_compare" id="5LmZ!RNVQaC7iq4%j)~I">
                            <field name="OP">GTE</field>
                            <value name="A">
                              <block type="math_single" id="~1:e-^*ly)o_Fsmi8:G3">
                                <field name="OP">ABS</field>
                                <value name="NUM">
                                  <shadow type="math_number" id="|5?6;%SXx]*9fDZ,Rrv}">
                                    <field name="NUM">9</field>
                                  </shadow>
                                  <block type="read_details" id="NKSj~/K9qk|IEZkrmUAI">
                                    <field name="DETAIL_INDEX">4</field>
                                  </block>
                                </value>
                              </block>
                            </value>
                            <value name="B">
                              <block type="variables_get" id="IrHbh`[`ga#j5(?T~xtd">
                                <field name="VAR" id="7O0^KGEFXjUXczC*,3?O" variabletype="">Max Loss Amount</field>
                              </block>
                            </value>
                          </block>
                        </value>
                        <statement name="DO0">
                          <block type="variables_set" id="r?8nSB_jRhXmo%D~xB}Q">
                            <field name="VAR" id="xIeIoQ.[=1[r+%M;)gZH" variabletype="">Initial Amount</field>
                            <value name="VALUE">
                              <block type="variables_get" id=".iYn9spC2iOgYU*3=BfH">
                                <field name="VAR" id="u}Yu/hNtN:S^^V!K(3V)" variabletype="">Win Amount</field>
                              </block>
                            </value>
                          </block>
                        </statement>
                      </block>
                    </next>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </statement>
        <next>
          <block type="text_join" id=".fX~|}Lx-!/(`8Wviw0Z">
            <field name="VARIABLE" id="3^CbE.FT|a?KgND:G.6F" variabletype="">text2</field>
            <statement name="STACK">
              <block type="text_statement" id="oPx3)F{6Ps^wJjqrjcYm">
                <value name="TEXT">
                  <shadow type="text" id="j`-vc.h|O$PCTKvn3Eh3">
                    <field name="TEXT"></field>
                  </shadow>
                  <block type="text" id="id!=aR#3Cq/dj-X(h0wy">
                    <field name="TEXT">Total Profit: </field>
                  </block>
                </value>
                <next>
                  <block type="text_statement" id="C;Ry}z`p4eN}Y4T?jZk*">
                    <value name="TEXT">
                      <shadow type="text" id="m4}{g//Oc+v5C/Cxqz7a">
                        <field name="TEXT"></field>
                      </shadow>
                      <block type="total_profit" id="X1erdgN)%(]5Mz/qwT%e"></block>
                    </value>
                  </block>
                </next>
              </block>
            </statement>
            <next>
              <block type="notify" id="%:mV-a_M2d5Z?Y*/#)rO">
                <field name="NOTIFICATION_TYPE">info</field>
                <field name="NOTIFICATION_SOUND">silent</field>
                <value name="MESSAGE">
                  <block type="variables_get" id="W0/z~7I,5~n~i~KEbWLM">
                    <field name="VAR" id="3^CbE.FT|a?KgND:G.6F" variabletype="">text2</field>
                  </block>
                </value>
                <next>
                  <block type="controls_if" id="Xrk:Ay~(DZAdhYwIW5+Y">
                    <mutation else="1"></mutation>
                    <value name="IF0">
                      <block type="logic_compare" id="*0:#DI$s)8ay04@ETmE@">
                        <field name="OP">LT</field>
                        <value name="A">
                          <block type="total_profit" id="PIz=tnGV`D~/f*z`J9IJ"></block>
                        </value>
                        <value name="B">
                          <block type="variables_get" id="XyEe6,0Waj:.62+#Oyep">
                            <field name="VAR" id="pG+F3kX1nbZ0d7R))Tya" variabletype="">Expected Profit</field>
                          </block>
                        </value>
                      </block>
                    </value>
                    <statement name="DO0">
                      <block type="trade_again" id="$pi7AOgJ{y/0c{/X,784"></block>
                    </statement>
                    <statement name="ELSE">
                      <block type="text_join" id="YGH*1U]*z#|;Ch_K?RI8">
                        <field name="VARIABLE" id="2Xl$jzJnXU+PSon]xl*C" variabletype="">text3</field>
                        <statement name="STACK">
                          <block type="text_statement" id="#Zs%5vOb|w%Hi?5jOEwz">
                            <value name="TEXT">
                              <shadow type="text" id="hlZwQc@j-EYXZ@/065q9">
                                <field name="TEXT"></field>
                              </shadow>
                              <block type="text" id="_$VSxz=fwDF$R1HMo2{i">
                                <field name="TEXT">Congratulations, Target profit hit 👍</field>
                              </block>
                            </value>
                            <next>
                              <block type="text_statement" id="*9Hm$Iz,TATVv*+;7)ch">
                                <value name="TEXT">
                                  <shadow type="text" id="`$BKA5mhFi3!3|aSiQo/">
                                    <field name="TEXT"></field>
                                  </shadow>
                                  <block type="total_profit" id="f?2X^grfu.]ZLG|E0~d+"></block>
                                </value>
                              </block>
                            </next>
                          </block>
                        </statement>
                        <next>
                          <block type="text_print" id="cp~4_t5iWG~Y2lA~5-2$">
                            <value name="TEXT">
                              <shadow type="text" id="h|j~Y8JcBFVMiKx*eKpK">
                                <field name="TEXT">abc</field>
                              </shadow>
                              <block type="variables_get" id="o_JqhECQ*TJC^kwhz+9)">
                                <field name="VAR" id="2Xl$jzJnXU+PSon]xl*C" variabletype="">text3</field>
                              </block>
                            </value>
                          </block>
                        </next>
                      </block>
                    </statement>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </next>
      </block>
    </statement>
  </block>
  <block type="before_purchase" id="/u8OLWoe3sHBh?(K|Bzv" x="0" y="744">
    <statement name="BEFOREPURCHASE_STACK">
      <block type="rsi_statement" id="d}B`!A,dDEJoniUUiob{">
        <field name="VARIABLE" id=":+:e?#}WbeHw6|F@%0jy" variabletype="">rsi</field>
        <statement name="STATEMENT">
          <block type="input_list" id="XIsi@lG+zp0#1q3rDS|L" deletable="false" movable="false">
            <value name="INPUT_LIST">
              <block type="ohlc_values" id="h:HBaVGdONJ,%5e#P^TD">
                <field name="OHLCFIELD_LIST">close</field>
                <field name="CANDLEINTERVAL_LIST">default</field>
              </block>
            </value>
            <next>
              <block type="period" id="UF7S71}!rQ8.NH)s6hg)" deletable="false" movable="false">
                <value name="PERIOD">
                  <block type="math_number" id="$VV%}ho2uq9].N5V}@f}">
                    <field name="NUM">2</field>
                  </block>
                </value>
              </block>
            </next>
          </block>
        </statement>
        <next>
          <block type="variables_set" id="+0nX#}s9q5OFn46t24,1">
            <field name="VAR" id="oAE;A-n$mSwY25a#87z5" variabletype="">RSI</field>
            <value name="VALUE">
              <block type="variables_get" id="(m9G)tpFma*z-LoCwiCd">
                <field name="VAR" id=":+:e?#}WbeHw6|F@%0jy" variabletype="">rsi</field>
              </block>
            </value>
            <next>
              <block type="text_join" id="R2T4p~x)MR|.0i4V{g_z">
                <field name="VARIABLE" id="m8O$RLbSJ4_j_*]rR[05" variabletype="">text4</field>
                <statement name="STACK">
                  <block type="text_statement" id="3`]kxd)IMix$~ROv^!{u">
                    <value name="TEXT">
                      <shadow type="text" id="`_Ck%i0G8+ZwO|pLP{%|">
                        <field name="TEXT"></field>
                      </shadow>
                      <block type="text" id="wCMDB^H@6aOLZ$u/OF~j">
                        <field name="TEXT">RSI:</field>
                      </block>
                    </value>
                    <next>
                      <block type="text_statement" id="`.jBy+^-i1qN{VS8gHcP">
                        <value name="TEXT">
                          <shadow type="text" id="4y5pduTK#x8h[k5DQ+kr">
                            <field name="TEXT"></field>
                          </shadow>
                          <block type="variables_get" id="oW(uNJ~VY-B?E}Y(|D`_">
                            <field name="VAR" id="oAE;A-n$mSwY25a#87z5" variabletype="">RSI</field>
                          </block>
                        </value>
                      </block>
                    </next>
                  </block>
                </statement>
                <next>
                  <block type="notify" id="~no#`{*}4MtndDD!ea%_">
                    <field name="NOTIFICATION_TYPE">error</field>
                    <field name="NOTIFICATION_SOUND">silent</field>
                    <value name="MESSAGE">
                      <block type="variables_get" id="i@r[@l*likU?iIN$UJfA">
                        <field name="VAR" id="m8O$RLbSJ4_j_*]rR[05" variabletype="">text4</field>
                      </block>
                    </value>
                    <next>
                      <block type="controls_if" id="VlWf}*^e1L}S%;j=`NJ2">
                        <mutation else="1"></mutation>
                        <value name="IF0">
                          <block type="logic_compare" id="-p:!k6[dS)Fc/T14TSeJ">
                            <field name="OP">GTE</field>
                            <value name="A">
                              <block type="variables_get" id="Nu205keG+ZNigcnAroV2">
                                <field name="VAR" id="oAE;A-n$mSwY25a#87z5" variabletype="">RSI</field>
                              </block>
                            </value>
                            <value name="B">
                              <block type="math_number" id="0M/G0K:K4,TI0UYNq@f1">
                                <field name="NUM">80</field>
                              </block>
                            </value>
                          </block>
                        </value>
                        <statement name="DO0">
                          <block type="purchase" id=".e.}%#su,:|zT)Moj#@u">
                            <field name="PURCHASE_LIST">PUT</field>
                          </block>
                        </statement>
                        <statement name="ELSE">
                          <block type="controls_if" id="~:BvOP,{bXyoPX0@X8QF">
                            <value name="IF0">
                              <block type="logic_compare" id="Q{P|DDhB6Nd~ig[r^tik">
                                <field name="OP">LTE</field>
                                <value name="A">
                                  <block type="variables_get" id="[Ovl|i]uDkI%8f]T-;Ib">
                                    <field name="VAR" id="oAE;A-n$mSwY25a#87z5" variabletype="">RSI</field>
                                  </block>
                                </value>
                                <value name="B">
                                  <block type="math_number" id="k[wAd@Ul1;]_b#i2@8,L">
                                    <field name="NUM">20</field>
                                  </block>
                                </value>
                              </block>
                            </value>
                            <statement name="DO0">
                              <block type="purchase" id="u_8N?npW/@BL*nXc(2Uc">
                                <field name="PURCHASE_LIST">CALL</field>
                              </block>
                            </statement>
                          </block>
                        </statement>
                      </block>
                    </next>
                  </block>
                </next>
              </block>
            </next>
          </block>
        </next>
      </block>
    </statement>
  </block>
  <block type="math_single" id="[^x@io,$pE=dKC/@A=JR" disabled="true" x="0" y="1816">
    <field name="OP">ABS</field>
    <value name="NUM">
      <shadow type="math_number" id=":|sg.y()s%ehY}uXLv4R">
        <field name="NUM">9</field>
      </shadow>
      <block type="read_details" id="FS=Dgz-)[kzN~@(f5N$n" disabled="true">
        <field name="DETAIL_INDEX">4</field>
      </block>
    </value>
  </block>
</xml>