----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/13/2024 02:20:35 PM
-- Design Name: 
-- Module Name: DecoderFA_tb - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

entity DecoderFA_tb is
--  Port ( );
end DecoderFA_tb;

-- E. Jagadeeswar Patro - 2241016309

architecture Dataflow of DecoderFA_tb is
component DecoderFA
port(a, b, c: in std_logic;
     sum, carry: out std_logic);
end component;
signal a, b, c, sum, carry: std_logic;
begin
uut: DecoderFA port map(a=>a, b=>b, c=>c, sum=>sum, carry=>carry);
stimulus: process
begin
a<='0'; b<='0'; c<='0'; wait for 10ns;
a<='0'; b<='0'; c<='1';wait for 10ns;
a<='0'; b<='1'; c<='0';wait for 10ns;
a<='0'; b<='1'; c<='1';wait for 10ns;
a<='1'; b<='0'; c<='0'; wait for 10ns;
a<='1'; b<='0'; c<='1';wait for 10ns;
a<='1'; b<='1'; c<='0';wait for 10ns;
a<='1'; b<='1'; c<='1';wait for 10ns;
end process;
end Dataflow;
